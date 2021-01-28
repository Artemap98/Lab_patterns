package interfaces;

public interface IResult {

    // returns true if result grade is greater than threshold value
    boolean GetGradeBool(int threshold);

    int GetGrade();

}
