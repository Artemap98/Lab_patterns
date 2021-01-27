package patterns.delegate.syntaxSkill;

import patterns.delegate.SkillPointGenerator;

public class GreatSyntaxSkill extends SyntaxSkill{

    public GreatSyntaxSkill(){
        skillQuality = "great";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(75,101);
    }
}
