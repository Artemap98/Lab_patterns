package core;

import interfaces.*;

import java.util.Random;
import java.util.Vector;

public class Examination implements IExam {
    @Override
    public IResult DoExam(IStudent student, ITest test) {

        System.out.println("Student "+student.GetName()+" writing test...");

        IResult myResult = null;

        Vector<SkillType> testSkillTypes = test.GetSkillTypes();

        int testSkillScore = 0;
        int studentSkillScore = 0;

        for (SkillType currTestSkillType:
             testSkillTypes) {
            ILanguageSkill studentSkill = student.GetLanguageSkill(currTestSkillType);
            testSkillScore += 100;
            studentSkillScore += studentSkill.GetSkillValue();
            System.out.println("his "+studentSkill.GetSkillName()
                    + " is " + studentSkill.GetSkillQuality());
        }

        // just random rule to make exam result
        int averageSkillScore = (int)((float)studentSkillScore / testSkillScore * 100);

        int resultGrade = 0;

        if(averageSkillScore + 25 > (new Random()).nextInt(100)){
            resultGrade = averageSkillScore;
        }

        System.out.println("his grade is " + resultGrade);

        myResult = new TestResult(resultGrade);



        return myResult;
    }


}
