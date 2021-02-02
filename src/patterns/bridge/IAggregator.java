package patterns.bridge;

import interfaces.ILanguageTest;
import interfaces.IResult;

public interface IAggregator {
    void SendResult(IResult result);
    void GetAverageResult(ILanguageTest test);
}
