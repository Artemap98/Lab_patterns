package patterns.delegate.punctuationSkill;

import patterns.delegate.SkillPointGenerator;

public class BadPunctuationSkill extends PunctuationSkill {

    public BadPunctuationSkill(){
        skillQuality = "bad";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(25,50);
    }
}
