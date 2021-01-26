package delegate.punctuationSkill;

import delegate.ILanguageSkill;

public abstract class PunctuationSkill implements ILanguageSkill {
    protected int skillPoint;
    protected String message;

    @Override
    public int ConfirmSkill() {
        System.out.println("I think my punctuation skill is " + message);
        return skillPoint;
    }

}

