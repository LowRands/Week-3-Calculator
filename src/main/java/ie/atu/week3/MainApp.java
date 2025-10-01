package ie.atu.week3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        Calculator calc = new Calculator();
       int result = calc.add(firstNumber, secondNumber);

       System.out.println("The result is: " + result);
    }
}
