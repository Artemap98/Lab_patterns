package interfaces;

import interfaces.SkillType;

public interface ILanguageSkill {

    // prints list of student skills in console
    void ConfirmSkill();


    int GetSkillValue();

    String GetSkillName();

    // returns in string how good the skill is
    String GetSkillQuality();

    SkillType GetSkillType();
}
