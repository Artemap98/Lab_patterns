package core;

import delegate.speakingSkill.*;
import delegate.syntaxSkill.*;
import delegate.punctuationSkill.*;

public class Main {

    public static void main(String[] args) {
        ForeignStudent george = new ForeignStudent("USA", "George Bush");
        ForeignStudent angela = new ForeignStudent("Germany", "Angela Merkel");
        ForeignStudent jackie = new ForeignStudent("China", "Jackie Chan");

        george.AddLanguageSkill(new BadPunctuationSkill());
        george.AddLanguageSkill(new BadSpeakingSkill());

        angela.AddLanguageSkill(new GreatPunctuationSkill());
        angela.AddLanguageSkill(new BadSyntaxSkill());

        jackie.AddLanguageSkill(new GoodPunctuationSkill());
        jackie.AddLanguageSkill(new GreatSpeakingSkill());
        jackie.AddLanguageSkill(new GreatSyntaxSkill());

        george.GreetMessage();
        george.ShowSkills();

        angela.GreetMessage();
        angela.ShowSkills();

        jackie.GreetMessage();
        jackie.ShowSkills();


        System.out.println("end");
    }
}
