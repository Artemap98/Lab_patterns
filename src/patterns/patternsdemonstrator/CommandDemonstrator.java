package patterns.patternsdemonstrator;

import core.ForeignStudent;
import core.LanguageTest;
import interfaces.ILanguageTest;
import interfaces.IStudent;
import patterns.command.*;

public class CommandDemonstrator {
    public void Run(){
        IStudent kim = new ForeignStudent("North Korea", "Kim Jong Un");
        ILanguageTest test = new LanguageTest();

        CommandReceiver receiver = new CommandReceiver();

        ICommand banCommand = new BanStudentCommand(receiver);
        ICommand startTestCommand = new TestStudentCommand(receiver);

        CommandInvoker banInvoker = new CommandInvoker(banCommand);
        CommandInvoker startTestInvoker = new CommandInvoker(startTestCommand);

        startTestInvoker.ExecuteCommand(kim, test);
        banInvoker.ExecuteCommand(kim, test);
    }
}
