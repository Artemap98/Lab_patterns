package patterns.state;

import interfaces.IExam;
import interfaces.ILanguageTest;
import interfaces.IResult;
import interfaces.IStudent;

public class StateBusy implements IStudentState{
    @Override
    public void BeginTest(IExam exam, ILanguageTest test, MonoTestStudent student) {
        System.out.println(student.GetName()+" is busy and can't start a new test now");
    }

    @Override
    public void EndTest(MonoTestStudent student) {
        student.SetState(new StateReady());
        IResult result =  student.myExam.DoExam(student, student.myTest);
        System.out.println(student.GetName()+" end test with result = " + result.GetGrade());
    }
}
