package patterns.delegate.speakingSkill;

import patterns.delegate.SkillPointGenerator;

public class GoodSpeakingSkill extends SpeakingSkill {

    public GoodSpeakingSkill(){
        skillQuality = "good";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(50,75);
    }
}
