// Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 

import java.util.Scanner;
public class Lvl2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input values for a, b, and c
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Perform integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c; 

        // Output results
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d%n", result1, result2, result3, result4);
    }
}