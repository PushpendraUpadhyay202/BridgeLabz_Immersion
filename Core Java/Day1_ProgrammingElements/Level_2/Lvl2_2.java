// Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 

import java.util.Scanner;
public class Lvl2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float base = input.nextFloat();
        float height = input.nextFloat();

        // Calculate area in square centimeters
        float areaCm = 0.5f * base * height;

        // Convert cm to inches (1 inch = 2.54 cm)
        float baseInches = base / 2.54f;
        float heightInches = height / 2.54f;

        // Calculate area in square inches
        float areaInches = 0.5f * baseInches * heightInches;

        //results
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaInches, areaCm);
    }
}