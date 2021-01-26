package delegate.speakingSkill;

import delegate.SkillPointGenerator;

public class GoodSpeakingSkill extends SpeakingSkill {

    public GoodSpeakingSkill(){
        message = "good";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(50,75);
    }
}
