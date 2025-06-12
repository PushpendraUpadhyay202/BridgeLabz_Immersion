// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.

import java.util.Scanner;
public class CalculateTotalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float unitPrice = input.nextFloat();
        int quantity = input.nextInt();

        // Cal total price
        float totalPrice = unitPrice * quantity;

        // Output result
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f%n", totalPrice, quantity, unitPrice);
    }
}