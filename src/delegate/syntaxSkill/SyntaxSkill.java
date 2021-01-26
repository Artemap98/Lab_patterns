package delegate.syntaxSkill;

import delegate.ILanguageSkill;

public abstract class SyntaxSkill implements ILanguageSkill {
    protected int skillPoint;
    protected String message;

    @Override
    public int ConfirmSkill() {
        System.out.println("My syntax skill is " + message);
        return skillPoint;
    }

}

