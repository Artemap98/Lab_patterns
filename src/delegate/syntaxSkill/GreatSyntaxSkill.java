package delegate.syntaxSkill;

import delegate.SkillPointGenerator;

public class GreatSyntaxSkill extends SyntaxSkill{

    public GreatSyntaxSkill(){
        message = "great";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(75,101);
    }
}
