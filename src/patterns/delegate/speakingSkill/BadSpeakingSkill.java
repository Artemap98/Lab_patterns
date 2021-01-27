package patterns.delegate.speakingSkill;

import patterns.delegate.SkillPointGenerator;

public class BadSpeakingSkill extends SpeakingSkill {

    public BadSpeakingSkill(){
        skillQuality = "bad";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(25,50);
    }
}
