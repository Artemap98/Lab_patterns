package core;

import interfaces.IResult;

public class TestResult implements IResult {

    private int myResult;

    public TestResult(int result){
        myResult = result;
    }

    // shows whether grade is positive of negative
    @Override
    public boolean GetGradeBool(int threshold) {
        return myResult >= threshold;
    }

    @Override
    public int GetGrade() {
        return myResult;
    }
}
