import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double num1, num2;
        char c;
        System.out.println("Enter Number 1:");
        num1 = input.nextDouble();
        System.out.println("Enter Operation like +, -, *, / :");
        c =input.next().charAt(0);
        System.out.println("Enter Number 2:");
        num2 = input.nextDouble();
        System.out.println(sum(num1, c, num2));

    }

    public static double sum(double num1, char c, double num2){
        double result = 0;
        switch (c) {
            case '+':
                result = num1 + num2;
            case '-':
                result = num1 - num2;
            case '*':
                result = num1 * num2;
            case '/':
                result = num1 / num2;
        }
        return result;
    }
}