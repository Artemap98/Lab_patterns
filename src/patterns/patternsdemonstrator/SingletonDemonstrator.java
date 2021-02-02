package patterns.patternsdemonstrator;

import core.*;
import interfaces.IExam;
import interfaces.SkillType;
import patterns.delegate.punctuationSkill.BadPunctuationSkill;
import patterns.delegate.speakingSkill.BadSpeakingSkill;
import patterns.delegate.syntaxSkill.GreatSyntaxSkill;
import patterns.singleton.ExaminationSingleton;

public class SingletonDemonstrator {
    public void Run() {
        //create some student and add skills
        ForeignStudent arnold = new ForeignStudent("Austria", "Arnold Schwarzenegger");
        arnold.AddLanguageSkill(new BadPunctuationSkill());
        arnold.AddLanguageSkill(new BadSpeakingSkill());
        arnold.AddLanguageSkill(new GreatSyntaxSkill());

        //create test
        LanguageTest test = new LanguageTest();
        test.AddSkillType(SkillType.PUNCTUATION);

        // old Examination initialization method
        //IExam exam = new Examination();

        //ExaminationSingleton derived from Examination
        IExam exam = ExaminationSingleton.getInstance();

        exam.DoExam(arnold, test);
        System.out.println('\n');
    }
}
