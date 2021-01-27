package patterns.delegate;

import core.ForeignStudent;
import patterns.delegate.punctuationSkill.BadPunctuationSkill;
import patterns.delegate.punctuationSkill.GoodPunctuationSkill;
import patterns.delegate.punctuationSkill.GreatPunctuationSkill;
import patterns.delegate.speakingSkill.BadSpeakingSkill;
import patterns.delegate.speakingSkill.GoodSpeakingSkill;
import patterns.delegate.speakingSkill.GreatSpeakingSkill;
import patterns.delegate.syntaxSkill.BadSyntaxSkill;
import patterns.delegate.syntaxSkill.GreatSyntaxSkill;

public class DelegateDemonstrator {
    public void run(){
        ForeignStudent george = new ForeignStudent("USA", "George Bush");
        ForeignStudent angela = new ForeignStudent("Germany", "Angela Merkel");
        ForeignStudent jackie = new ForeignStudent("China", "Jackie Chan");

        george.AddLanguageSkill(new BadPunctuationSkill());
        george.AddLanguageSkill(new GoodSpeakingSkill());
        george.AddLanguageSkill(new BadSyntaxSkill());

        angela.AddLanguageSkill(new GreatPunctuationSkill());
        angela.AddLanguageSkill(new BadSyntaxSkill());
        angela.AddLanguageSkill(new GoodSpeakingSkill());

        jackie.AddLanguageSkill(new GoodPunctuationSkill());
        jackie.AddLanguageSkill(new GreatSpeakingSkill());
        jackie.AddLanguageSkill(new GreatSyntaxSkill());

        george.GreetMessage();
        george.ShowSkills();

        angela.GreetMessage();
        angela.ShowSkills();

        jackie.GreetMessage();
        jackie.ShowSkills();
    }
}
