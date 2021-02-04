package patterns.command;

import interfaces.ILanguageTest;
import interfaces.IStudent;

public interface ICommand {
    void Execute(IStudent student, ILanguageTest test);
}
