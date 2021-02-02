package patterns.decorator;

import core.TestResult;
import interfaces.IExam;
import interfaces.IResult;
import interfaces.IStudent;
import interfaces.ILanguageTest;

public class ExaminationWithMerits implements IExam{
    private IExam originalExam;
    private int meritsPoints;

    public ExaminationWithMerits(IExam exam, int merits){
        originalExam = exam;
        meritsPoints += merits;
    }

    @Override
    public IResult DoExam(IStudent student, ILanguageTest test) {

        IResult originalResult = originalExam.DoExam(student, test);

        int meritGrade = Math.min(100, originalResult.GetGrade() + meritsPoints);

        IResult meritResult = new TestResult( meritGrade );

        System.out.println("additional points for merits = " + meritsPoints);
        System.out.println("His grade with merits = " + meritResult.GetGrade());
        System.out.println("re-exam passed? " + meritResult.GetGradeBool(25));

        return meritResult;
    }
}
