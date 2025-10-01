package ie.atu.week3;

public class Calculator {
    public double add(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    public double subtract(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    public double multiply(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    public double divide(double firstNum, double secondNum) {
        if (secondNum == 0) {
            System.out.println("Error");
            return 0;
        } else {
            return firstNum / secondNum;
        }
    }

    public double power(double base, double exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        }else{
            return Math.pow(base, exponent);
        }
    }
    public  double mod(double a, double b) {
        return a % b;
    }
}
