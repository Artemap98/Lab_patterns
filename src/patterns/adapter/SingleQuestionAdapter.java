package patterns.adapter;

import interfaces.IAnswer;
import interfaces.IQuestion;

import java.util.Vector;

public class SingleQuestionAdapter implements IQuestion{

    private ISingleAnswerQuestion singleAnswerQuestion;

    public SingleQuestionAdapter(ISingleAnswerQuestion singleAnswerQuestion){

        this.singleAnswerQuestion = singleAnswerQuestion;

    }

    @Override
    public String GetText() {
        return singleAnswerQuestion.GetText();
    }

    @Override
    public boolean IsComplex() {
        return false;
    }

    @Override
    public void AddAnswer(IAnswer newAnswer, boolean isCorrect) {
        singleAnswerQuestion.AddAnswer(newAnswer, isCorrect);
    }

    @Override
    public Vector<IAnswer> GetAnswers() {
        return singleAnswerQuestion.GetAnswers();
    }

    @Override
    public boolean CheckCorrectAnswer(IAnswer answer) {
        return singleAnswerQuestion.CheckCorrectAnswer(answer);
    }

    @Override
    public boolean CheckAllCorrectAnswers(Vector<IAnswer> answers) {

        boolean isCorrect = true;

        for (IAnswer currAnswer:
                answers) {
            if (singleAnswerQuestion.CheckCorrectAnswer(currAnswer))
                isCorrect = false;
        }

        return isCorrect;

    }
}
