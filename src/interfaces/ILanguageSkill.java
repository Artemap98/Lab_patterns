package interfaces;

import interfaces.SkillType;

public interface ILanguageSkill {

    void ConfirmSkill();
    int GetSkillValue();

    String GetSkillName();
    String GetSkillQuality();

    SkillType GetSkillType();
}
