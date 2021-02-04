package core;

import patterns.patternsdemonstrator.*;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        PrintStream out = System.out;
        String stars = "\n***********************************************\n";

        out.println(stars+"1) shows, how delegate pattern works");
        (new DelegateDemonstrator()).Run();

        out.println(stars+"2) shows, how demonstrator pattern works");
        (new DecoratorDemonstrator()).Run();

        out.println(stars+"3) shows, how adapter pattern works");
        (new AdapterDemonstrator()).Run();

        out.println(stars+"4) shows, how prototype pattern works");
        (new PrototypeDemonstrator()).Run();

        out.println(stars+"5) shows, how object pool pattern works");
        (new ObjectPoolDemonstrator()).Run();

        out.println(stars+"6) shows, how singleton pattern works");
        (new SingletonDemonstrator()).Run();

        out.println(stars+"7) shows, how observer pattern works");
        (new ObserverDemonstrator()).Run();

        out.println(stars+"8) shows, how state pattern works");
        (new StateDemonstrator()).Run();

        out.println(stars+"9) shows, how chain of responsibility pattern works");
        (new ChainResponsibilityDemonstrator()).Run();

        out.println(stars+"10) shows, how facade pattern works");
        (new FacadeDemonstrator()).Run();

        out.println(stars+"11) shows, how bridge pattern works");
        (new BridgeDemonstrator()).Run();

        out.println(stars+"12) shows, how command pattern works");
        (new CommandDemonstrator()).Run();

        System.out.println("end");
    }
}
