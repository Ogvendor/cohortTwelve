package marvechenky;
import java.util.Scanner;

import java.io.PrintStream;

public class phoneMenu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle here: ");
        final double PI = 3.14159;
        double radius = input.nextDouble();
        double area = PI * radius * radius;
        System.out.println("The area for the circle of radius " +  radius + " is: " + area);
        System.out.println("Welcome home to my" +
                "new landing profile page");
        double i = 50.0;
        double k = i + 50.0;
        double j = k + 1;
        System.out.println("j is " + j + " and k is " + k);

        double miles = 100;
        final double KILOMETERS_PER_MILES = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILES;
        System.out.println("Kilometers is: " + kilometers);

    }
}
