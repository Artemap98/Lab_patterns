package patterns.patternsdemonstrator;

import core.Examination;
import core.ForeignStudent;
import core.LanguageTest;
import interfaces.SkillType;
import patterns.delegate.punctuationSkill.GreatPunctuationSkill;
import patterns.delegate.speakingSkill.GreatSpeakingSkill;
import patterns.delegate.syntaxSkill.GreatSyntaxSkill;
import patterns.state.MonoTestStudent;

public class StateDemonstrator {
    public void Run(){
        //create some student and add skills
        MonoTestStudent ada = new MonoTestStudent("England", "Ada Lovelace");
        ada.AddLanguageSkill(new GreatPunctuationSkill());
        ada.AddLanguageSkill(new GreatSpeakingSkill());
        ada.AddLanguageSkill(new GreatSyntaxSkill());

        //create test
        LanguageTest test = new LanguageTest();
        test.AddSkillType(SkillType.PUNCTUATION);
        test.AddSkillType(SkillType.SPEAKING);

        LanguageTest test2 = new LanguageTest();
        test2.AddSkillType(SkillType.SYNTAX);
        test2.AddSkillType(SkillType.SPEAKING);

        //create standard exam
        Examination exam = new Examination();

        ada.EndTest();

        ada.BeginTest(exam, test);
        ada.BeginTest(exam, test2);

        ada.EndTest();


        System.out.println('\n');
    }
}
