package delegate.speakingSkill;

import delegate.ILanguageSkill;

public abstract class SpeakingSkill implements ILanguageSkill {
    protected int skillPoint;
    protected String message;

    @Override
    public int ConfirmSkill() {
        System.out.println("I have a " + message + " speaking skill");
        return skillPoint;
    }

}

