package patterns.command;

import interfaces.ILanguageTest;
import interfaces.IStudent;

public class BanStudentCommand implements ICommand{

    private CommandReceiver receiver;

    public BanStudentCommand(CommandReceiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void Execute(IStudent student, ILanguageTest test) {
        System.out.println("Command to ban student ...");
        receiver.BanStudent(student,test);
    }
}
