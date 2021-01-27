package patterns.decorator;

import core.Examination;
import core.ForeignStudent;
import core.LanguageTest;
import interfaces.SkillType;
import patterns.delegate.punctuationSkill.BadPunctuationSkill;
import patterns.delegate.speakingSkill.GreatSpeakingSkill;
import patterns.delegate.syntaxSkill.GreatSyntaxSkill;

public class DecoratorDemonstrator {
    public void run(){
        ForeignStudent guy = new ForeignStudent("UK", "Guy Ritchie");
        guy.AddLanguageSkill(new BadPunctuationSkill());
        guy.AddLanguageSkill(new GreatSpeakingSkill());
        guy.AddLanguageSkill(new GreatSyntaxSkill());

        LanguageTest test = new LanguageTest();
        test.AddSkillType(SkillType.PUNCTUATION);
        test.AddSkillType(SkillType.SPEAKING);

        Examination exam = new Examination();
        exam.DoExam(guy, test);
        System.out.println('\n');

        RetakeExamination retakeExam = new RetakeExamination(exam);
        retakeExam.DoExam(guy, test);
        System.out.println('\n');

        ExaminationWithMerits meritsExam = new ExaminationWithMerits(retakeExam,25);
        meritsExam.DoExam(guy,test);
        System.out.println('\n');


    }
}
