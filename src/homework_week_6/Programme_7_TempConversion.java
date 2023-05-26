package homework_week_6;

import java.util.Scanner;

/**
 * Write a programme to insert any temperature value in degree Fehrenheit
 * and convert to degree Celcius((F-32) X 5/9 =0 C).
 */

public class Programme_7_TempConversion
{
    public static void main(String[] args)
    {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fehrenheit :");
        float temp =scanner.nextFloat();

        // Object Creation
        Programme_7_TempConversion t =new Programme_7_TempConversion();
        t.convertTempToDegreeCelsius(temp);

        // clossing the scanner object

        scanner.close();
    }
    // Temperature conversion method
    public void convertTempToDegreeCelsius(float temp)
    {
        float c =((temp - 32) * 5 /9);
        System.out.println("The temperature" + temp + " ferenheit is equal to" + c + "degree celsius");
    }

}
