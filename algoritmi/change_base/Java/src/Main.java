import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

    public static Integer fromBase8ToBase10(Integer x){
        var digits = Integer.toString(x).chars().map(Character::getNumericValue).toArray();
        var y =0;
        var multiplier = 0;
        for (int i = digits.length-1,j=0; i>=0;i--,j++) {
            multiplier = (int)Math.pow(8,j);
            y += digits[i]*multiplier;
        }
        return y;
    }
}
