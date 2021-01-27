package patterns.delegate.speakingSkill;

import patterns.delegate.BaseSkill;
import interfaces.ILanguageSkill;
import interfaces.SkillType;

public abstract class SpeakingSkill extends BaseSkill implements ILanguageSkill {

    SpeakingSkill(){
        skillName = "speaking";
        skillType = SkillType.SPEAKING;
    }
}

