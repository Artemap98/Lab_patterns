package interfaces;

import java.util.Vector;

public interface ITest {

    int GetQuestionAmount();
    IQuestion GetQuestionById(int id);
    void AddQuestion(IQuestion question);
    void AddSkillType(SkillType newSkillType);
    Vector<SkillType> GetSkillTypes();

}
