package patterns.command;

import core.Examination;
import interfaces.ILanguageTest;
import interfaces.IStudent;

public class TestStudentCommand implements ICommand{

    private CommandReceiver receiver;

    public TestStudentCommand(CommandReceiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void Execute(IStudent student, ILanguageTest test) {

        System.out.println("Command to start student testing...");
        receiver.StartTest(student,test);
    }
}
