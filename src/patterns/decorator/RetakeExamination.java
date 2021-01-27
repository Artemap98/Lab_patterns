package patterns.decorator;

import core.TestResult;
import interfaces.IExam;
import interfaces.IResult;
import interfaces.IStudent;
import interfaces.ITest;

public class RetakeExamination implements IExam {

    IExam originalExam;

    public RetakeExamination(IExam exam){
        originalExam = exam;
    }

    @Override
    public IResult DoExam(IStudent student, ITest test) {

        System.out.println(student.GetName() + " try to retake exam..");

        IResult originalResult = originalExam.DoExam(student, test);

        float decreasedResult = originalResult.GetGrade() * 0.7f;

        IResult retakeResult = new TestResult( (int) decreasedResult );

        System.out.println("His grade after re-examination = " + retakeResult.GetGrade());

        System.out.println("re-exam passed? " + retakeResult.GetGradeBool(25));

        return retakeResult;
    }
}
