// Write a program to find the side of the square whose parameter you read from the user 
import java.util.Scanner;
public class SideOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        float perimeter = input.nextFloat();

        float side = perimeter / 4;

        //result
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f%n", side, perimeter);
    }
}   