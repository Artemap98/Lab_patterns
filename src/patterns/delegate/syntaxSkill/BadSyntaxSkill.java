package patterns.delegate.syntaxSkill;

import patterns.delegate.SkillPointGenerator;

public class BadSyntaxSkill extends SyntaxSkill{

    public BadSyntaxSkill(){
        skillQuality = "bad";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(25,50);
    }
}
