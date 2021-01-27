package patterns.delegate;

import interfaces.ILanguageSkill;
import interfaces.SkillType;

public abstract class BaseSkill implements ILanguageSkill {
    protected int skillPoint; // количество очков 1-100
    protected String skillName; // название навыка
    protected String skillQuality; // качество навыка (хорошее/плохое)
    protected SkillType skillType; // тип навыка из списка


    @Override
    public void ConfirmSkill() {
        System.out.println("My "+ skillName +" skill is " + skillQuality);
    }

    @Override
    public int GetSkillValue(){
        return skillPoint;
    }

    @Override
    public SkillType GetSkillType() {
        return skillType;
    }


    @Override
    public String GetSkillName() {
        return skillName;
    }

    @Override
    public String GetSkillQuality() {
        return skillQuality;
    }
}
