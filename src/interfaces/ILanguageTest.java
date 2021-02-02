package interfaces;

import java.util.Vector;

public interface ILanguageTest {

    int GetQuestionAmount();
    Vector<IQuestion> GetQuestions();
    IQuestion GetQuestionById(int id);
    void AddQuestion(IQuestion question);
    void AddSkillType(SkillType newSkillType);
    Vector<SkillType> GetSkillTypes();

}
