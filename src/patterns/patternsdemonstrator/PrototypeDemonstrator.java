package patterns.patternsdemonstrator;

import core.ForeignStudent;
import core.StandardAnswer;
import core.StandardQuestion;
import interfaces.IAnswer;
import interfaces.IExam;
import interfaces.IQuestion;
import interfaces.SkillType;
import patterns.delegate.punctuationSkill.BadPunctuationSkill;
import patterns.delegate.speakingSkill.GreatSpeakingSkill;
import patterns.delegate.syntaxSkill.GoodSyntaxSkill;
import patterns.prototype.ClonnableTest;
import patterns.singleton.ExaminationSingleton;

import java.util.Vector;

public class PrototypeDemonstrator {

    public void Run(){

        // create some student
        ForeignStudent barack = new ForeignStudent("USA", "Barack Obama");
        barack.AddLanguageSkill(new BadPunctuationSkill());
        barack.AddLanguageSkill(new GreatSpeakingSkill());
        barack.AddLanguageSkill(new GoodSyntaxSkill());

        // create some test
        ClonnableTest test = new ClonnableTest();
        test.AddSkillType(SkillType.SPEAKING);

        Vector<IQuestion> questions = InitQuestions();

        //add our created questions to test
        test.AddQuestion(questions.get(0));
        test.AddQuestion(questions.get(1));

        //Create clone of existing test to make harder version
        ClonnableTest harderTest = test.Clone();

        //add new questions and skill-checks
        harderTest.AddQuestion(questions.get(2));
        harderTest.AddSkillType(SkillType.PUNCTUATION);

        //create instance of exam
        IExam exam = ExaminationSingleton.getInstance();

        //run standard language test
        System.out.println("Standard test");
        test.showQuestions();
        exam.DoExam(barack, test);

        System.out.println("################################");

        //run hard language test
        System.out.println("Hard test");
        harderTest.showQuestions();
        exam.DoExam(barack, harderTest);
        System.out.println('\n');
    }

    public Vector<IQuestion> InitQuestions(){
        // make questions filling
        String questionText1 = "What is full name of a famous writer A.S.Pushkin?";
        String answerText11 = "Alexander Sergeevich",
                answerText12 = "Anatoly Stepanovich",
                answerText13 = "Arkady Semyonovich";

        String questionText2 = "What year was Lev Nikolayevich Tolstoy born?";
        String answerText21 = "1984",
                answerText22 = "1828",
                answerText23 = "1573";

        String questionText3 = "who wrote the book \"The Master and Margarita\"?";
        String answerText31 = "Dostaevsky",
                answerText32 = "Lermontov",
                answerText33 = "Bulgakov";

        // create instances of answers
        IAnswer answer11 = new StandardAnswer(answerText11),
                answer12 = new StandardAnswer(answerText12),
                answer13 = new StandardAnswer(answerText13);

        IAnswer answer21 = new StandardAnswer(answerText21),
                answer22 = new StandardAnswer(answerText22),
                answer23 = new StandardAnswer(answerText23);

        IAnswer answer31 = new StandardAnswer(answerText21),
                answer32 = new StandardAnswer(answerText22),
                answer33 = new StandardAnswer(answerText23);

        IQuestion standardQuestion1 = new StandardQuestion(questionText1, false),
                standardQuestion2 = new StandardQuestion(questionText2, false),
                standardQuestion3 = new StandardQuestion(questionText3, false);

        // fill the standard questions
        standardQuestion1.AddAnswer(answer11, false);
        standardQuestion1.AddAnswer(answer12, false);
        standardQuestion1.AddAnswer(answer13, true);

        standardQuestion2.AddAnswer(answer21, false);
        standardQuestion2.AddAnswer(answer22, false);
        standardQuestion2.AddAnswer(answer23, true);

        standardQuestion3.AddAnswer(answer31, false);
        standardQuestion3.AddAnswer(answer32, false);
        standardQuestion3.AddAnswer(answer33, true);

        Vector<IQuestion> questions = new Vector<>();
        questions.add(standardQuestion1);
        questions.add(standardQuestion2);
        questions.add(standardQuestion3);

        return questions;
    }

}
