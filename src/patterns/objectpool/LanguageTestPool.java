package patterns.objectpool;

import interfaces.ILanguageTest;
import interfaces.IQuestion;
import interfaces.SkillType;
import patterns.patternsdemonstrator.PrototypeDemonstrator;
import patterns.prototype.ClonnableTest;

import java.util.Vector;

public class LanguageTestPool {

    private Vector<ILanguageTest> testVariants = new Vector<>();

    public LanguageTestPool(){
        // create some test
        ClonnableTest test = new ClonnableTest();
        test.AddSkillType(SkillType.SPEAKING);

        Vector<IQuestion> questions = new PrototypeDemonstrator().InitQuestions();

        //add our created questions to test
        test.AddQuestion(questions.get(0));
        test.AddQuestion(questions.get(1));

        //Create clone of existing test to make harder version
        ClonnableTest harderTest = test.Clone();

        //add new questions and skill-checks
        harderTest.AddQuestion(questions.get(2));
        harderTest.AddSkillType(SkillType.PUNCTUATION);

        testVariants.add(harderTest);
        testVariants.add(test);
    }

    public ILanguageTest GetTest(){

        if (testVariants.size() <= 0)
            return null;

        ILanguageTest languageTestInstance = testVariants.firstElement();
        testVariants.remove(0);
        return languageTestInstance;
    }

    public void ReleaseTest(ILanguageTest languageTest){
        testVariants.add(languageTest);
    }

}
