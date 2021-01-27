package core;

import interfaces.IAnswer;
import interfaces.IQuestion;
import interfaces.ITest;
import interfaces.SkillType;

import java.util.Vector;

public class LanguageTest implements ITest {

    protected Vector<IQuestion> questions = new Vector<IQuestion>();
    protected Vector<SkillType> skillTypes = new Vector<SkillType>();


    @Override
    public int GetQuestionAmount() {
        return questions.size();
    }

    @Override
    public IQuestion GetQuestionById(int id) {
        IQuestion question = null;
        try {
            question = questions.get(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return question;
    }

    @Override
    public void AddQuestion(IQuestion question) {
        questions.add(question);
    }

    @Override
    public void AddSkillType(SkillType newSkillType) {
        skillTypes.add(newSkillType);
    }

    @Override
    public Vector<SkillType> GetSkillTypes() {
        return skillTypes;
    }
}
