package core;

import interfaces.IAnswer;
import interfaces.IQuestion;

import java.util.Vector;

public class StandardQuestion implements IQuestion {

    private String textQuestion;
    private boolean isComplex;
    private Vector<IAnswer> answers = new Vector<>();
    private Vector<IAnswer> correctAnswers = new Vector<>();

    public StandardQuestion(String textQuestion, boolean isComplex){

        this.textQuestion = textQuestion;

        this.isComplex = isComplex;

    }

    @Override
    public String GetText() {
        return textQuestion;
    }

    @Override
    public boolean IsComplex() {
        return isComplex;
    }

    @Override
    public void AddAnswer(IAnswer newAnswer, boolean isCorrect) {
        answers.add(newAnswer);
        if (isCorrect)
            correctAnswers.add(newAnswer);
    }

    @Override
    public Vector<IAnswer> GetAnswers() {
        return answers;
    }

    @Override
    public boolean CheckCorrectAnswer(IAnswer answer) {
        boolean isCorrect = false;
        if(correctAnswers.contains(answer))
            isCorrect = true;

        return isCorrect;
    }

    @Override
    public boolean CheckAllCorrectAnswers(Vector<IAnswer> answers) {
        boolean isCorrect = true;

        for (IAnswer currAnswer:
                answers) {
            if (!correctAnswers.contains(currAnswer))
                isCorrect = false;
        }

        return isCorrect;
    }
}
