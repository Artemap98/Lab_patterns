package patterns.bridge;

import interfaces.ILanguageTest;
import interfaces.IResult;

public class GradeAggregatorController {
    private IAggregator aggregator;

    public GradeAggregatorController(IAggregator aggregator){
        this.aggregator = aggregator;
    }

    public void SendResult(IResult result){
        aggregator.SendResult(result);
    }

    public void GetAverageResult(ILanguageTest test) {
        aggregator.GetAverageResult(test);
    }

}
