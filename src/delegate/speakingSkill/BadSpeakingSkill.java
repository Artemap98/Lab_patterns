package delegate.speakingSkill;

import delegate.SkillPointGenerator;

public class BadSpeakingSkill extends SpeakingSkill {

    public BadSpeakingSkill(){
        message = "bad";
        skillPoint = SkillPointGenerator.GenerateSkillPoint(25,50);
    }
}
