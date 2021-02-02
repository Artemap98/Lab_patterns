package patterns.state;

import interfaces.*;
import patterns.delegate.EmptyLanguageSkill;

import java.util.Vector;

public class MonoTestStudent implements IStudent {

    private Vector<ILanguageSkill> myLanguageSkills = new Vector<ILanguageSkill>();
    private String myCountry;
    private String myName;
    private IStudentState myState;
    public ILanguageTest myTest;
    public IExam myExam;

    public MonoTestStudent(String country, String name){
        myState = new StateReady();
        myCountry = country;
        myName = name;
    }

    public void GreetMessage(){
        System.out.println("Hello! My name is " + myName + "! I'm from " + myCountry+".");
    }

    @Override
    public String GetCountry() {
        return myCountry;
    }

    @Override
    public String GetName() {
        return myName;
    }

    @Override
    public void AddLanguageSkill(ILanguageSkill newSkill){
        myLanguageSkills.add(newSkill);
    }

    @Override
    public ILanguageSkill GetLanguageSkill(SkillType type) {
        ILanguageSkill resultSkill = null;
        for (ILanguageSkill currSkill:
                myLanguageSkills) {
            if(currSkill.GetSkillType() == type){
                resultSkill = currSkill;
            }
        }
        if(resultSkill == null){
            resultSkill = new EmptyLanguageSkill(type);
        }
        return resultSkill;
    }

    public void ShowSkills(){
        for (ILanguageSkill skill:
                myLanguageSkills) {
            skill.ConfirmSkill();
        }
        System.out.println("\n");
    }

    public void SetState(IStudentState state){
        this.myState = state;
    }

    public void BeginTest(IExam exam, ILanguageTest test) {
        myState.BeginTest(exam, test, this);
    }

    public void EndTest(){
        myState.EndTest(this);
    }
}
