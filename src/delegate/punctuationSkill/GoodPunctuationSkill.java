package delegate.punctuationSkill;

import delegate.SkillPointGenerator;

public class GoodPunctuationSkill extends PunctuationSkill {

    public GoodPunctuationSkill(){
        message = "good";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(50,75);
    }
}
