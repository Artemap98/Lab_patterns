package delegate.punctuationSkill;

import delegate.SkillPointGenerator;

public class BadPunctuationSkill extends PunctuationSkill {

    public BadPunctuationSkill(){
        message = "bad";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(25,50);
    }
}
