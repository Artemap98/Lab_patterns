package patterns.state;

import interfaces.IExam;
import interfaces.ILanguageTest;
import interfaces.IResult;
import interfaces.IStudent;

public class StateReady implements IStudentState{

    private IExam exam;
    private ILanguageTest test;
    private IStudent student;

    @Override
    public void BeginTest(IExam exam, ILanguageTest test, MonoTestStudent student) {
        student.myExam = exam;
        student.myTest = test;
        student.SetState(new StateBusy());
        System.out.println(student.GetName()+" starting test");
    }

    @Override
    public void EndTest(MonoTestStudent student) {
        System.out.println(student.GetName()+" is not writing test now");
    }
}
