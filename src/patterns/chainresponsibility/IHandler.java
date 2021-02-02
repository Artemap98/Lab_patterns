package patterns.chainresponsibility;

import interfaces.IStudent;

public interface ITestHandler {
    void SetNext(ITestHandler nextHandler);
    void Handle(IStudent student);

}
