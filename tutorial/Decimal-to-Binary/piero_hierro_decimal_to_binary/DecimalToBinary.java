package piero_hierro_date_calculator;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Write a number");
        var decimal = sc.nextInt();
        System.out.println(Integer.toBinaryString(decimal));
    }

}
