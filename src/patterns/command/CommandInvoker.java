package patterns.command;

import interfaces.ILanguageTest;
import interfaces.IStudent;

public class CommandInvoker {
    private ICommand command;

    public CommandInvoker(ICommand command){
        SetCommand(command);
    }

    public void SetCommand(ICommand command) {
        this.command = command;
    }

    public void ExecuteCommand(IStudent student, ILanguageTest test){
        System.out.println("Some command was invoked");
        command.Execute(student,test);
    }
}
