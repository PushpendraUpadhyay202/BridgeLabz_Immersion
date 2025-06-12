// Write a program to create a basic calculator for addition, subtraction, multiplication, and division. 
// The program should ask for two numbers (floating point) and perform all the operations

import java.util.Scanner;
public class Lvl2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();

        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = 0;

        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
            return;
        }

        //results
        System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f%n", number1, number2, addition, subtraction, multiplication, division);
        
    }
}