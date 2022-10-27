import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Filippo Lampa
 */
public class change_base_main {

    public static void main(String[] args) {
        //hex, octal, decimal and binary

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert first base");

        String firstBase = sc.nextLine();

        System.out.println("Insert second base");

        String secondBase = sc.nextLine();

        System.out.println("Insert value to convert");

        String valueToConvert = sc.nextLine();

        String convertedValue = "";

        switch(firstBase){
            case "hex":
                if(secondBase.equals("octal")){
                    convertedValue = hex_to_octal(valueToConvert);
                } else if(secondBase.equals("decimal")){
                    convertedValue = String.valueOf(hex_to_decimal(valueToConvert));
                } else if(secondBase.equals("binary")){
                    convertedValue = hexToBin(valueToConvert);
                }; break;
            case "octal":
                if(secondBase.equals("hex")){
                    convertedValue = octalToHex(valueToConvert);
                } else if(secondBase.equals("decimal")){
                    convertedValue = octalToDecimal(valueToConvert);
                } else if(secondBase.equals("binary")){
                    convertedValue = octalToBinary(valueToConvert);
                }; break;
            case "decimal":
                if(secondBase.equals("octal")){
                    convertedValue = decimalToOctal(valueToConvert);
                } else if(secondBase.equals("hex")){
                    convertedValue = decimalToHex(valueToConvert);
                } else if(secondBase.equals("binary")){
                    convertedValue = decimalToBinary(valueToConvert);
                }; break;
            case "binary":
                if(secondBase.equals("octal")){
                    convertedValue = binaryToOctal(valueToConvert);
                } else if(secondBase.equals("decimal")){
                    convertedValue = binaryToDecimal(valueToConvert);
                } else if(secondBase.equals("hex")){
                    convertedValue = binaryToHex(valueToConvert);
                }; break;
        }

        System.out.println("The converted value is: " + convertedValue);
    }

    public static String binaryToHex(String valueToConvert){
        int decimal = Integer.parseInt(valueToConvert,2);
        return Integer.toString(decimal,16);
    }

    public static String binaryToDecimal(String valueToConvert){
        return String.valueOf(Integer.parseInt(valueToConvert,2));
    }

    public static String binaryToOctal(String valueToConvert){
        int bnum = Integer.parseInt(valueToConvert, 2);
        return Integer.toOctalString(bnum);
    }

    public static String octalToDecimal(String valueToConvert){
        return String.valueOf(Integer.parseInt(valueToConvert, 8));
    }

    public static String decimalToBinary(String valueToConvert){
        return Integer.toBinaryString(Integer.parseInt(valueToConvert));
    }

    public static String decimalToHex(String valueToConvert){
        return Integer.toHexString(Integer.parseInt(valueToConvert));
    }

    public static String decimalToOctal(String valueToConvert){
        return Integer.toOctalString(Integer.parseInt(valueToConvert));
    }

    public static String octalToHex(String valueToConvert){
        int octalToDecimal = Integer.parseInt(valueToConvert, 8);
        return Integer.toHexString(octalToDecimal).toUpperCase();
    }

    public static int hex_to_decimal(String s){
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }

    public static String hex_to_octal(String valueToConvert){
        int i=1;
        int[] octal_num = new int[100];
        int dec_num = hex_to_decimal(valueToConvert);
        while(dec_num != 0)
        {
            octal_num[i++] = dec_num%8;
            dec_num = dec_num/8;
        }
        StringBuilder builder = new StringBuilder();
        for(int j=i-1; j>0; j--)
        {
            builder.append(octal_num[j]);
        }
        return builder.toString();
    }

    static String hexToBin(String s) {
        return new BigInteger(s, 16).toString(2);
    }

    static String octalToBinary(String octalValue)
    {

        int i = 0;

        String binaryValue = "";

        while (i < octalValue.length()) {

            char c = octalValue.charAt((int)i);

            switch (c) {
                case '0':
                    binaryValue += "000";
                    break;
                case '1':
                    binaryValue += "001";
                    break;
                case '2':
                    binaryValue += "010";
                    break;
                case '3':
                    binaryValue += "011";
                    break;
                case '4':
                    binaryValue += "100";
                    break;
                case '5':
                    binaryValue += "101";
                    break;
                case '6':
                    binaryValue += "110";
                    break;
                case '7':
                    binaryValue += "111";
                    break;
                default:
                    System.out.println(
                            "\nInvalid Octal Digit "
                                    + octalValue.charAt(i));
                    break;
            }
            i++;
        }
        return binaryValue;
    }

}
