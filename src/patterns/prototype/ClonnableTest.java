package patterns.prototype;

import core.LanguageTest;
import interfaces.ILanguageTest;
import interfaces.IQuestion;
import interfaces.SkillType;

import java.util.Vector;

public class ClonnableTest extends LanguageTest {

    public ClonnableTest(ILanguageTest parentTest){
        super();
        this.questions = (Vector<IQuestion>)parentTest.GetQuestions().clone();
        this.skillTypes = (Vector<SkillType>) parentTest.GetSkillTypes().clone();
    }

    public ClonnableTest(){
        super();
    }

    public ClonnableTest Clone(){
        return (new ClonnableTest(this));
    }
}
