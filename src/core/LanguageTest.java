package core;

import interfaces.IAnswer;
import interfaces.IQuestion;
import interfaces.ILanguageTest;
import interfaces.SkillType;

import java.util.Vector;

public class LanguageTest implements ILanguageTest {

    protected Vector<IQuestion> questions = new Vector<IQuestion>();
    protected Vector<SkillType> skillTypes = new Vector<SkillType>();

    public void showQuestions(){

        int counter = 1;

        for (IQuestion currQuestion :
                questions) {
            System.out.println("Question number " + (counter++) + ":");
            System.out.println(currQuestion.GetText());
            Vector<IAnswer> answers = currQuestion.GetAnswers();
            for (IAnswer ans :
                    answers) {
                System.out.println("\t"+ans.getText());
            }
            System.out.println(' ');
        }
    }

    @Override
    public int GetQuestionAmount() {
        return questions.size();
    }

    @Override
    public Vector<IQuestion> GetQuestions() {
        return questions;
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
