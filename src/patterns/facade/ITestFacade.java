package patterns.facade;

import interfaces.ILanguageTest;
import interfaces.IResult;
import interfaces.IStudent;

public interface ITestFacade {

    IStudent CreateGreatStudent(String name, String country);

    ILanguageTest CreateComplexTest();

    IResult DoTestStudent(IStudent student, ILanguageTest test);

}
