package delegate.syntaxSkill;

import delegate.SkillPointGenerator;

public class GoodSyntaxSkill extends SyntaxSkill{

    public GoodSyntaxSkill(){
        message = "good";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(50,75);
    }
}
