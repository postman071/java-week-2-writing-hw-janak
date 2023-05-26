package homework_week_6;

import java.util.Scanner;

/**
 * Write a Programme to enter any radius value of circle and find out the area.(Formula of Area A=Pi*r*r).
 */
public class Programme_6_AreaOfCircle
{
        public static void main(String[]args)
        {
            // Scanner declaration for reading input from console

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Radius :");
            double radius = scanner.nextDouble();
            areaOfCircle(radius);
            // closing the scanner object
            scanner.close();

        }
        // Calculating the area of circle
    public static void areaOfCircle(double radius)
    {
        double pi =Math.PI;
        double area=(pi * radius * radius);
        System.out.println("The area of Circle is :" + area);
    }
}
