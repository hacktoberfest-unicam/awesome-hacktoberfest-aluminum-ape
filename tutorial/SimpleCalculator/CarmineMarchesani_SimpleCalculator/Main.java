package tutorial.SimpleCalculator.CarmineMarchesani_SimpleCalculator;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        SimpleCalculator calc = new SimpleCalculator();
        Scanner input = new Scanner(System.in);

        double firstNumber, secondNumber;

        System.out.println("Select an option:\n" +
                "1)Sum \n" +
                "2)Subtraction\n" +
                "3)Multiplication\n" +
                "4)Division\n");

        int choice = input.nextInt();

        System.out.println("Insert the first number: ");
        firstNumber = input.nextDouble();
        System.out.println("Insert the second number: ");
        secondNumber = input.nextDouble();

        switch (choice)
        {
            case 1:
                System.out.println("Result is: "+ calc.sum(firstNumber,secondNumber));
                break;
            case 2:
                System.out.println("Result is: "+ calc.subtraction(firstNumber,secondNumber));
                break;
            case 3:
                System.out.println("Result is: " + calc.multiplication(firstNumber, secondNumber));
                break;
            case 4:
                System.out.println("Result is: "+ calc.division(firstNumber, secondNumber));
                break;
            default:
                System.out.println(" :( ");
                break;
        }
    }
}
