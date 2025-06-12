// Similarly, write the DoubleOpt program by taking double values and doing the same operations.
import java.util.Scanner;
public class Lvl2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input values for a, b, and c
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Perform double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Output results
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n", result1, result2, result3, result4);
    }
}