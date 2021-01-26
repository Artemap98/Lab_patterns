package delegate.punctuationSkill;

import delegate.SkillPointGenerator;

public class GreatPunctuationSkill extends PunctuationSkill {

    public GreatPunctuationSkill(){
        message = "great";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(75,101);
    }
}
