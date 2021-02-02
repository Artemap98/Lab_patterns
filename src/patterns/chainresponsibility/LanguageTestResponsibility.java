package patterns.chainresponsibility;

import core.Examination;
import interfaces.*;

import java.util.Vector;

public class LanguageTestResponsibility implements ILanguageTest, IHandler {

    protected Vector<IQuestion> questions = new Vector<IQuestion>();
    protected Vector<SkillType> skillTypes = new Vector<SkillType>();
    protected IHandler nextHandler;
    protected IExam exam = new Examination();


    public void SetExam(IExam exam){
        this.exam = exam;
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

    @Override
    public void SetNext(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void Handle(IStudent student) {
        exam.DoExam(student, this);
        if(nextHandler != null){
            nextHandler.Handle(student);
        }
    }
}
