package patterns.delegate.punctuationSkill;

import patterns.delegate.SkillPointGenerator;

public class GoodPunctuationSkill extends PunctuationSkill {

    public GoodPunctuationSkill(){
        skillQuality = "good";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(50,75);
    }
}
