package patterns.patternsdemonstrator;

import core.Examination;
import core.ForeignStudent;
import core.LanguageTest;
import interfaces.SkillType;
import patterns.chainresponsibility.LanguageEssay;
import patterns.chainresponsibility.LanguageTestResponsibility;
import patterns.delegate.punctuationSkill.BadPunctuationSkill;
import patterns.delegate.speakingSkill.GoodSpeakingSkill;
import patterns.delegate.syntaxSkill.BadSyntaxSkill;

public class ChainResponsibilityDemonstrator {
    public void Run(){
        //create some student and add skills
        ForeignStudent homer = new ForeignStudent("USA", "Homer Simpson");
        homer.AddLanguageSkill(new BadPunctuationSkill());
        homer.AddLanguageSkill(new GoodSpeakingSkill());
        homer.AddLanguageSkill(new BadSyntaxSkill());

        //create test
        LanguageTestResponsibility test = new LanguageTestResponsibility();
        test.AddSkillType(SkillType.PUNCTUATION);

        LanguageEssay essay = new LanguageEssay();

        LanguageTestResponsibility test1 = new LanguageTestResponsibility();
        test1.AddSkillType(SkillType.SPEAKING);

        test.SetNext(essay);
        essay.SetNext(test1);

        test.Handle(homer);


        System.out.println('\n');
    }
}
