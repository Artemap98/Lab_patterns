package patterns.chainresponsibility;

import interfaces.IStudent;

public interface IHandler {
    void SetNext(IHandler nextHandler);
    void Handle(IStudent student);

}
