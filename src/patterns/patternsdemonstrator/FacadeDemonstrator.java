package patterns.patternsdemonstrator;

import interfaces.ILanguageTest;
import interfaces.IResult;
import interfaces.IStudent;
import patterns.facade.StudentTestingFacade;

public class FacadeDemonstrator {
    public void Run(){
        StudentTestingFacade myTesting = new StudentTestingFacade();

        ILanguageTest test = myTesting.CreateComplexTest();
        IStudent student = myTesting.CreateGreatStudent("Alice", "Wonderland");

        IResult result = myTesting.DoTestStudent(student, test);

        System.out.println("Facade result = " + result.GetGrade());

    }
}
