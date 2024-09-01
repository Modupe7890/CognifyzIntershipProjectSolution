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

    }
}
