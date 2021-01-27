package patterns.delegate;

import java.util.Random;

public class SkillPointGenerator {
    public static int GenerateSkillPoint( int min, int max){
        int points = (new Random()).nextInt(max-min)+min;
        return points;
    }
}
