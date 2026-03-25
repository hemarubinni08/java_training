import java.util.*;

public class ArithmeticOperationsHema {
    public static int Addition(int a, int b) {
        return a + b;
    }

    public static int Subtraction(int a, int b) {
        return a - b;
    }

    public static int Multiplication(int a, int b) {
        return a * b;
    }

    public static int Division(int a, int b) {
        return a / b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        ArithmeticOperationsHema am = new ArithmeticOperationsHema();

        System.out.println("Addition : " + am.Addition(number1, number2));
        System.out.println("Subtraction : " + am.Subtraction(number1, number2));
        System.out.println("Multiplication : " + am.Multiplication(number1, number2));
        System.out.println("Division : " + am.Division(number1, number2));

    }
    }
