package patterns.patternsdemonstrator;

import core.LanguageTest;
import core.TestResult;
import interfaces.ILanguageTest;
import interfaces.IResult;
import patterns.bridge.BdAggregator;
import patterns.bridge.GradeAggregatorController;
import patterns.bridge.WebServerAggregator;

public class BridgeDemonstrator {
    public void Run(){

        GradeAggregatorController webController =
                new GradeAggregatorController(new WebServerAggregator());

        GradeAggregatorController databaseController =
                new GradeAggregatorController(new BdAggregator());

        IResult result1 = new TestResult(43);
        IResult result2 = new TestResult(89);

        ILanguageTest test1 = new LanguageTest();
        ILanguageTest test2 = new LanguageTest();

        webController.SendResult(result1);
        webController.GetAverageResult(test1);

        databaseController.SendResult(result2);
        databaseController.GetAverageResult(test2);


    }
}
