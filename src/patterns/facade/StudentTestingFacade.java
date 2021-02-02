package patterns.facade;

import core.Examination;
import core.ForeignStudent;
import core.LanguageTest;
import interfaces.*;
import patterns.delegate.punctuationSkill.BadPunctuationSkill;
import patterns.delegate.punctuationSkill.GreatPunctuationSkill;
import patterns.delegate.speakingSkill.GreatSpeakingSkill;
import patterns.delegate.syntaxSkill.GoodSyntaxSkill;
import patterns.delegate.syntaxSkill.GreatSyntaxSkill;

public class StudentTestingFacade implements ITestFacade {
    @Override
    public IStudent CreateGreatStudent(String name, String country) {
        ForeignStudent student = new ForeignStudent(country, name);
        student.AddLanguageSkill(new GreatPunctuationSkill());
        student.AddLanguageSkill(new GreatSpeakingSkill());
        student.AddLanguageSkill(new GreatSyntaxSkill());

        return student;
    }

    @Override
    public ILanguageTest CreateComplexTest() {
        LanguageTest test = new LanguageTest();
        test.AddSkillType(SkillType.PUNCTUATION);
        test.AddSkillType(SkillType.SPEAKING);
        test.AddSkillType(SkillType.SYNTAX);

        return test;
    }

    @Override
    public IResult DoTestStudent(IStudent student, ILanguageTest test) {
        IExam exam = new Examination();
        return exam.DoExam(student, test);
    }
}
