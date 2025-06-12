// Write a program to take 2 numbers and print their quotient and reminder
import java.util.Scanner;
public class Lvl2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Cal quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Results
        System.out.printf("The Quotient is %d and Reminder is %d of two numbers %d and %d%n", quotient, remainder, number1, number2);
    }
}