import java.math.*;

public class ToBinaryConvertor {
    public static BigInteger toBinary(int decimal) {
        return new BigInteger(Integer.toBinaryString(decimal));
    }
}
