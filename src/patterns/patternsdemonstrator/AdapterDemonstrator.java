package patterns.patternsdemonstrator;

import core.*;
import interfaces.IAnswer;
import interfaces.IQuestion;
import interfaces.SkillType;
import patterns.adapter.ISingleAnswerQuestion;
import patterns.adapter.SingleAnswerQuestion;
import patterns.adapter.SingleQuestionAdapter;
import patterns.decorator.ExaminationWithMerits;
import patterns.decorator.RetakeExamination;
import patterns.delegate.punctuationSkill.BadPunctuationSkill;
import patterns.delegate.speakingSkill.GreatSpeakingSkill;
import patterns.delegate.syntaxSkill.GoodSyntaxSkill;

public class AdapterDemonstrator {

    public void Run(){

        // create some student
        ForeignStudent wonka = new ForeignStudent("WonkaLand", "Willy Wonka");
        wonka.AddLanguageSkill(new BadPunctuationSkill());
        wonka.AddLanguageSkill(new GreatSpeakingSkill());
        wonka.AddLanguageSkill(new GoodSyntaxSkill());

        // create some test
        LanguageTest test = new LanguageTest();
        test.AddSkillType(SkillType.SPEAKING);

        // make questions filling
        String questionText1 = "what year were candy invented?";
        String answerText11 = "1923",
                answerText12 = "734",
                answerText13 = "1543";
        String questionText2 = "how many candies can an elephant eat?";
        String answerText21 = "10",
                answerText22 = "100",
                answerText23 = "1000";

        // create instances of answers
        IAnswer answer11 = new StandardAnswer(answerText11),
                answer12 = new StandardAnswer(answerText12),
                answer13 = new StandardAnswer(answerText13);
        IAnswer answer21 = new StandardAnswer(answerText21),
                answer22 = new StandardAnswer(answerText22),
                answer23 = new StandardAnswer(answerText23);

        // create instance of question which needs to be adapted
        ISingleAnswerQuestion singleAnswerQuestion =
                new SingleAnswerQuestion(questionText1);

        // fill this question with answers
        singleAnswerQuestion.AddAnswer(answer11, false);
        singleAnswerQuestion.AddAnswer(answer12, true);
        singleAnswerQuestion.AddAnswer(answer13, false);

        //create adapter to non-standard question and standard question
        IQuestion adaptedQuestion = new SingleQuestionAdapter(singleAnswerQuestion);
        IQuestion standardQuestion = new StandardQuestion(questionText2, false);

        // fill the standard question
        standardQuestion.AddAnswer(answer21, false);
        standardQuestion.AddAnswer(answer22, false);
        standardQuestion.AddAnswer(answer23, true);

        //add our created questions to test
        test.AddQuestion(standardQuestion);
        test.AddQuestion(adaptedQuestion);

        test.showQuestions();

        Examination exam = new Examination();
        exam.DoExam(wonka, test);
        System.out.println('\n');

    }


}
