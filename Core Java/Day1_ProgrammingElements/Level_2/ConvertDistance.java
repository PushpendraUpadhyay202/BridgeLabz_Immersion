// Write a program to find the distance in yards and miles for the distance provided by the user in feet

import java.util.Scanner;
public class ConvertDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        float distanceInFeet = input.nextFloat();

        //feet to yards and miles
        float distanceInYards = distanceInFeet / 3;
        float distanceInMiles = distanceInYards / 1760;

        // Results
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f%n", distanceInYards, distanceInMiles);
    }
}