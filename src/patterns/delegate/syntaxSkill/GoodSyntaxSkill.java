package patterns.delegate.syntaxSkill;

import patterns.delegate.SkillPointGenerator;

public class GoodSyntaxSkill extends SyntaxSkill{

    public GoodSyntaxSkill(){
        skillQuality = "good";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(50,75);
    }
}
