package patterns.command;

import interfaces.ILanguageTest;
import interfaces.IStudent;

public class CommandReceiver {

    public void BanStudent(IStudent student, ILanguageTest test){
        System.out.println("Command to ban student " + student.GetName()
                +" received and executed\n");
    }

    public void StartTest(IStudent student, ILanguageTest test){
        System.out.println("Command to start test for "+student.GetName()
                + " received and executed\n");
    }

}
