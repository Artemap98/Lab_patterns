package interfaces;

public interface IExam {

    // returns student test result
    IResult DoExam(IStudent student, ILanguageTest test);
}
