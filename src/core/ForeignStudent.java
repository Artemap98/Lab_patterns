package core;

import interfaces.IStudent;
import interfaces.ILanguageSkill;
import interfaces.ITest;
import interfaces.SkillType;
import patterns.delegate.EmptyLanguageSkill;

import java.util.Vector;

public class ForeignStudent implements IStudent {

    private Vector<ILanguageSkill> myLanguageSkills = new Vector<ILanguageSkill>();
    private String myCountry;
    private String myName;

    public ForeignStudent(String country, String name){
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

    public void BeginTest(ITest test) {

    }

    public void EndTest(){

    }

}
