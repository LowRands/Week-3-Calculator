package ie.atu.week3;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        if (input.hasNextDouble()){
            double firstNumber = input.nextDouble();

            System.out.print("Enter the second number: ");

            double secondNumber = input.nextDouble();

            System.out.println("Choose an operation (add, subtract, multiply, divide, power, mod): ");
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
                case "power" -> {
                    Calculator calc = new Calculator();
                    yield calc.power(firstNumber, secondNumber);
                }
                case "mod" -> {
                    Calculator calc = new Calculator();
                    yield calc.mod(firstNumber, secondNumber);
                }
                default -> {
                    System.out.println("Invalid operation");
                    yield 0;
                }
            };
            System.out.println("The result is: " + result);
        }
        else {
            System.out.println("Invalid Number");
        }

    }
}
