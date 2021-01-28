package interfaces;

public interface IStudent {

    String GetCountry();

    String GetName();

    void AddLanguageSkill(ILanguageSkill newSkill);
    ILanguageSkill GetLanguageSkill(SkillType type);
}
