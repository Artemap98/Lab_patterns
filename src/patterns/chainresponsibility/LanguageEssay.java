package patterns.chainresponsibility;

import interfaces.IStudent;

public class LanguageEssay implements IHandler {

    private IHandler nextHandler;

    @Override
    public void SetNext(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void Handle(IStudent student) {
        System.out.println("Student "+student.GetName()+" is writing essay...");
        System.out.println("Student "+student.GetName()+" has finished essay.");

        if(nextHandler != null){
            nextHandler.Handle(student);
        }
    }
}
