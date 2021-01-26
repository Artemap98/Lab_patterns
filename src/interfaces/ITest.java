package interfaces;

public interface ITest {


    void StartTest();
    int GetQuestionAmount();
    IQuestion GetQuestionById(int id);
    void PutAnswer(IQuestion question, IAnswer answer);
    void StopTest();

    boolean IsTestInProgress();

    IAnswer GetResult();

}
