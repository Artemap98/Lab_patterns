package patterns.delegate.speakingSkill;

import patterns.delegate.SkillPointGenerator;

public class GreatSpeakingSkill extends SpeakingSkill {

    public GreatSpeakingSkill(){
        skillQuality = "great";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(75,101);
    }
}
