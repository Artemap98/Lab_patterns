package patterns.patternsdemonstrator;

import core.Examination;
import core.ForeignStudent;
import core.LanguageTest;
import core.TestResult;
import interfaces.IResult;
import interfaces.SkillType;
import patterns.delegate.punctuationSkill.BadPunctuationSkill;
import patterns.delegate.punctuationSkill.GreatPunctuationSkill;
import patterns.delegate.speakingSkill.GreatSpeakingSkill;
import patterns.delegate.syntaxSkill.GreatSyntaxSkill;
import patterns.observer.StudentNotificator;
import patterns.observer.subscribers.EmailSubscriber;
import patterns.observer.subscribers.RatingSubscriber;
import patterns.observer.subscribers.SmsSubscriber;

public class ObserverDemonstrator {
    public void Run(){
        //create some student and add skills
        ForeignStudent steeve = new ForeignStudent("APPLE", "Steeve Jobs");
        steeve.AddLanguageSkill(new GreatPunctuationSkill());
        steeve.AddLanguageSkill(new GreatSpeakingSkill());
        steeve.AddLanguageSkill(new GreatSyntaxSkill());

        StudentNotificator notificator = new StudentNotificator();
        notificator.AddSubscriber(new EmailSubscriber(steeve.GetName()));
        notificator.AddSubscriber(new RatingSubscriber(steeve.GetName()));
        notificator.AddSubscriber(new SmsSubscriber(steeve.GetName()));

        //create test
        LanguageTest test = new LanguageTest();
        test.AddSkillType(SkillType.PUNCTUATION);
        test.AddSkillType(SkillType.SPEAKING);

        //create standard exam
        Examination exam = new Examination();
        IResult result = exam.DoExam(steeve, test);

        //call notification method
        notificator.NotificySubscribers(result.GetGrade());

        System.out.println('\n');
    }
}
