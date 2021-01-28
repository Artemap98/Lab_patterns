package patterns.adapter;

import interfaces.IAnswer;

import java.util.Vector;

public interface ISingleAnswerQuestion {

    // get statement of a question
    String GetText();

    void AddAnswer(IAnswer newAnswer, boolean isCorrect);

    Vector<IAnswer> GetAnswers();

    // returns true if an answer is correct
    boolean CheckCorrectAnswer(IAnswer answer);


}
