package patterns.singleton;

import core.Examination;
import interfaces.IExam;

public class ExaminationSingleton extends Examination implements IExam {
    private static ExaminationSingleton ourInstance = new ExaminationSingleton();

    public static ExaminationSingleton getInstance() {
        return ourInstance;
    }

    private ExaminationSingleton() {
        super();
    }



}
