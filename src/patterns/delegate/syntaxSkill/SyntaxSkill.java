package patterns.delegate.syntaxSkill;

import patterns.delegate.BaseSkill;
import interfaces.ILanguageSkill;
import interfaces.SkillType;

public abstract class SyntaxSkill extends BaseSkill implements ILanguageSkill {

    SyntaxSkill(){
        skillName = "syntax";
        skillType = SkillType.SYNTAX;
    }


}

