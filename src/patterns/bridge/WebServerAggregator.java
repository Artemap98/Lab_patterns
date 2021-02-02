package patterns.bridge;

import interfaces.ILanguageTest;
import interfaces.IResult;

import java.util.Random;

public class WebServerAggregator implements IAggregator{
    @Override
    public void SendResult(IResult result) {
        // imagine that we send grades to web server
        System.out.println("Grade "+result.GetGrade()+" successfully sent to " +
                "www.langtest.ru");
    }

    @Override
    public void GetAverageResult(ILanguageTest test) {
        // imagine that we request average grade for the test from web server
        int avgGrade = (new Random()).nextInt(75)+25;
        System.out.println("Average Grade for this test is "+avgGrade);

    }
}
