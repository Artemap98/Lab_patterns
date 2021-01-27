package core;

import patterns.decorator.DecoratorDemonstrator;

public class Main {

    public static void main(String[] args) {

        // shows, how patterns.delegate pattern works
        //(new DelegateDemonstrator()).run();

        // shows, how patterns.adapter pattern works
        (new DecoratorDemonstrator()).run();


        System.out.println("end");
    }
}
