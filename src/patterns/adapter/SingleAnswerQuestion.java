package patterns.adapter;

import interfaces.IAnswer;

import java.util.Vector;

public class SingleAnswerQuestion implements ISingleAnswerQuestion{

    private String textQuestion;
    private Vector<IAnswer> answers = new Vector<>();
    private IAnswer correctAnswer;

    public SingleAnswerQuestion(String textQuestion){

        this.textQuestion = textQuestion;

    }

    @Override
    public String GetText() {
        return textQuestion;
    }

    @Override
    public void AddAnswer(IAnswer newAnswer, boolean isCorrect) {
        answers.add(newAnswer);
        if (isCorrect)
            correctAnswer = newAnswer;
    }

    @Override
    public Vector<IAnswer> GetAnswers() {
        return answers;
    }

    @Override
    public boolean CheckCorrectAnswer(IAnswer answer) {
        boolean isCorrect = false;
        if(correctAnswer.equals(answer))
            isCorrect = true;

        return isCorrect;
    }

}
