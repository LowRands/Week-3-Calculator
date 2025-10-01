package ie.atu.week3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Choose an operation (add, subtract, multiply, divide): ");
        String operation = input.next();

        double result = switch (operation){
            case "add" -> {
                Calculator calc = new Calculator();
                yield calc.add(firstNumber, secondNumber);

            }
            case  "subtract" -> {
                Calculator calc = new Calculator();
                yield calc.subtract(firstNumber, secondNumber);
            }
            case  "multiply" -> {
                Calculator calc = new Calculator();
                yield calc.multiply(firstNumber, secondNumber);
            }
            case  "divide" -> {
                Calculator calc = new Calculator();
                yield calc.divide(firstNumber, secondNumber);
            }
            default -> {
                System.out.println("Invalid operation");
                yield 0;
            }
        };


       System.out.println("The result is: " + result);
    }
}
