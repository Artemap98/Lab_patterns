package patterns.delegate.punctuationSkill;

import patterns.delegate.BaseSkill;
import interfaces.ILanguageSkill;
import interfaces.SkillType;

public abstract class PunctuationSkill extends BaseSkill implements ILanguageSkill {

    PunctuationSkill(){
        skillName = "punctuation";
        skillType = SkillType.PUNCTUATION;
    }
}

