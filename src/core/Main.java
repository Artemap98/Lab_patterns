package core;

import patterns.patternsdemonstrator.AdapterDemonstrator;
import patterns.patternsdemonstrator.DecoratorDemonstrator;
import patterns.patternsdemonstrator.DelegateDemonstrator;

public class Main {

    public static void main(String[] args) {

        // shows, how delegate pattern works
        //(new DelegateDemonstrator()).Run();

        // shows, how demonstrator pattern works
        //(new DecoratorDemonstrator()).Run();

        // shows, how adapter pattern works
        (new AdapterDemonstrator()).Run();




        System.out.println("end");
    }
}
