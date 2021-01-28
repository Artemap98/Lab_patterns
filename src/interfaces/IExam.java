package interfaces;

import java.util.Vector;

public interface IExam {

    // returns student test result
    IResult DoExam(IStudent student, ITest test);
}
