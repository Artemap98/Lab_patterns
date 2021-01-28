package patterns.patternsdemonstrator;

import core.Examination;
import core.ForeignStudent;
import core.LanguageTest;
import interfaces.SkillType;
import patterns.decorator.ExaminationWithMerits;
import patterns.decorator.RetakeExamination;
import patterns.delegate.punctuationSkill.BadPunctuationSkill;
import patterns.delegate.speakingSkill.GreatSpeakingSkill;
import patterns.delegate.syntaxSkill.GreatSyntaxSkill;

public class DecoratorDemonstrator {
    public void Run(){

        //create some student and add skills
        ForeignStudent guy = new ForeignStudent("UK", "Guy Ritchie");
        guy.AddLanguageSkill(new BadPunctuationSkill());
        guy.AddLanguageSkill(new GreatSpeakingSkill());
        guy.AddLanguageSkill(new GreatSyntaxSkill());

        //create test
        LanguageTest test = new LanguageTest();
        test.AddSkillType(SkillType.PUNCTUATION);
        test.AddSkillType(SkillType.SPEAKING);

        //create standard exam
        Examination exam = new Examination();
        exam.DoExam(guy, test);
        System.out.println('\n');

        // create secondary attempt exam
        RetakeExamination retakeExam = new RetakeExamination(exam);
        retakeExam.DoExam(guy, test);
        System.out.println('\n');

        // create priveleged attempt exam
        ExaminationWithMerits meritsExam = new ExaminationWithMerits(retakeExam,25);
        meritsExam.DoExam(guy,test);
        System.out.println('\n');


    }
}
