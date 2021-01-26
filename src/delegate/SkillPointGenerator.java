package delegate;

import java.util.Random;

public class SkillPointGenerator {
    public static int GenerateSkillPoint( int min, int max){
        return (new Random()).nextInt(max-min)-min;
    }
}
