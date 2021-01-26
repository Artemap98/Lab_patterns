package delegate.speakingSkill;

import delegate.SkillPointGenerator;

public class GreatSpeakingSkill extends SpeakingSkill {

    public GreatSpeakingSkill(){
        message = "great";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(75,101);
    }
}
