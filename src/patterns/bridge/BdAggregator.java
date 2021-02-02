package patterns.bridge;

import interfaces.IAnswer;
import interfaces.ILanguageTest;
import interfaces.IResult;

import java.util.Random;

public class BdAggregator implements IAggregator {
    @Override
    public void SendResult(IResult result) {
        // imagine that we send grades to local database
        System.out.println("New grade "+result.GetGrade()+" successfully" +
                " added to local database");
    }

    @Override
    public void GetAverageResult(ILanguageTest test) {
        // imagine that we request average grade for the test from local database
        int avgGrade = (new Random()).nextInt(75)+25;
        System.out.println("AVG grade for this test from DB = "+avgGrade);

    }
}
