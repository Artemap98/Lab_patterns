package core;

import delegate.ILanguageSkill;
import interfaces.ITest;

import java.util.Vector;

public class ForeignStudent{

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

    public String GetCountry() {
        return myCountry;
    }

    public String GetName() {
        return myName;
    }

    public void AddLanguageSkill(ILanguageSkill newSkill){
        myLanguageSkills.add(newSkill);
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

}
