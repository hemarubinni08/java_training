import java.util.*;

public class ArithmeticOperationsHema {
    public static int Addition(int Number1, int Number2) {

        return Number1 + Number2;
    }

    public static int Addition(int Number1, int Number2, int Number3) {

        return Number1 + Number2 + Number3;
    }

    public static int Subtraction(int Number1, int Number2) {

        return Number1 - Number2;
    }

    public static int Multiplication(int Number1, int Number2) {

        return Number1 * Number2;
    }

    public static int Division(int Number1, int Number2) {

        return Number1 / Number2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers(number1,number2) : ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        ArithmeticOperationsHema am = new ArithmeticOperationsHema();
        System.out.println("Addition : " + am.Addition(number1, number2));
        System.out.println("Subtraction : " + am.Subtraction(number1, number2));
        System.out.println("Multiplication : " + am.Multiplication(number1, number2));
        System.out.println("Division : " + am.Division(number1, number2));
        System.out.println("Addition of 3 numbers : " + am.Addition(number1,number2,number3));
    }
}
