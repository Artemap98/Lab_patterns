package patterns.state;

import interfaces.IExam;
import interfaces.ILanguageTest;
import interfaces.IResult;
import interfaces.IStudent;

public interface IStudentState {
    void BeginTest(IExam exam, ILanguageTest test, MonoTestStudent student);
    void EndTest(MonoTestStudent student);
}
