package interfaces;

import java.util.Vector;

public interface IQuestion {

    // get statement of a question
    String GetText();

    // returns true if a question have more than one correct answer
    boolean IsComplex();

    void AddAnswer(IAnswer newAnswer, boolean isCorrect);

    Vector<IAnswer> GetAnswers();

    // returns true if an answer is correct
    boolean CheckCorrectAnswer(IAnswer answer);

    // returns true if all answers is correct
    boolean CheckAllCorrectAnswers(Vector<IAnswer> answers);

}
