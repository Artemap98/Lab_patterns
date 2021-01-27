package patterns.delegate;

import interfaces.SkillType;

public class EmptyLanguageSkill extends BaseSkill{

    public EmptyLanguageSkill(SkillType newSkillType){
        skillType = newSkillType;
        skillPoint = 0;
        skillName = newSkillType.name();
        skillQuality = "very bad";
    }

}
