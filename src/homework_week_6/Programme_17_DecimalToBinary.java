package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java programme to convert a decimal number to binary number.
 * Input data:
 * Input a decimal Number : 5
 * Expected Output
 * Binary Number is :101
 */
public class Programme_17_DecimalToBinary
{
    public static void main(String[] args)
    {
        // Scanner declaration for reading input from console.
        System.out.println( "Welcome to Jaa programme to convert decimal to binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter decimal number");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        // Clossing the scanner object
        scanner.close();
    }
    // Converting the decimal to binary
    public static void convertDecimalToBinary(int number)
    {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is :" +binary);
    }
}
