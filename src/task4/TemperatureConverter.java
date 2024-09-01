package task4;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please kindly read through and follow the instructions.");
        System.out.println("-------------------------------------------------------");

        System.out.println("Please enter your Temperature: ");
        double temp = input.nextDouble();

        System.out.println("Select your preferred conversion option");
        System.out.println("1. Fahrenheit to Celsius: ");
        System.out.println("2. Celsius to Fahrenheit: ");

        int Option = input.nextInt();
        double convertedTemp;
        switch (Option) {
            case 1:
                convertedTemp = fahrenheitToCelsius(temp);
                System.out.println("Your temperature " + temp + "°F has been converted to " + convertedTemp + "°C");
                break;
            case 2:
                convertedTemp = celsiusToFahrenheit(temp);
                System.out.println("Your temperature " + temp + "°C has been converted to "
                        + convertedTemp + "°F");
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
    public static double fahrenheitToCelsius (double fahrenheit){
        return  (fahrenheit - 32) * 9/5;
    }
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
}
