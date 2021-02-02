package patterns.patternsdemonstrator;

import core.ForeignStudent;
import core.LanguageTest;
import interfaces.IExam;
import interfaces.ILanguageTest;
import interfaces.IQuestion;
import interfaces.SkillType;
import patterns.delegate.punctuationSkill.BadPunctuationSkill;
import patterns.delegate.speakingSkill.GreatSpeakingSkill;
import patterns.delegate.syntaxSkill.GoodSyntaxSkill;
import patterns.objectpool.LanguageTestPool;
import patterns.prototype.ClonnableTest;
import patterns.singleton.ExaminationSingleton;

import java.util.Vector;

public class ObjectPoolDemonstrator {

    public void Run(){

        // create some student
        ForeignStudent jerar = new ForeignStudent("France", "Jerar De Partie");
        jerar.AddLanguageSkill(new BadPunctuationSkill());
        jerar.AddLanguageSkill(new GreatSpeakingSkill());
        jerar.AddLanguageSkill(new GoodSyntaxSkill());

        LanguageTestPool testPool = new LanguageTestPool();

        ClonnableTest test = (ClonnableTest) testPool.GetTest();
        ClonnableTest anotherTest = (ClonnableTest) testPool.GetTest();

        //create instance of exam
        IExam exam = ExaminationSingleton.getInstance();

        //run first language test
        System.out.println("First test");
        test.showQuestions();
        exam.DoExam(jerar, test);

        System.out.println("************************************");

        //run hard language test
        System.out.println("Different test");
        anotherTest.showQuestions();
        exam.DoExam(jerar, anotherTest);
        System.out.println('\n');

    }
}
