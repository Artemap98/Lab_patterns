package patterns.delegate.punctuationSkill;

import patterns.delegate.SkillPointGenerator;

public class GreatPunctuationSkill extends PunctuationSkill {

    public GreatPunctuationSkill(){
        skillQuality = "great";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(75,101);
    }
}
