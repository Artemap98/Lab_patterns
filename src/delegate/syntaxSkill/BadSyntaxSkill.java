package delegate.syntaxSkill;

import delegate.SkillPointGenerator;

public class BadSyntaxSkill extends SyntaxSkill{

    public BadSyntaxSkill(){
        message = "bad";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(25,50);
    }
}
