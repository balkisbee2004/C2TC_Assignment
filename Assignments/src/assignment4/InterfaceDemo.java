package assignment4;

import java.util.Scanner;

public class InterfaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select Airline:");
        System.out.println("1. Air India");
        System.out.println("2. KingFisher");
        System.out.println("3. Indigo");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter hours of flight: ");
        int hours = sc.nextInt();

        System.out.print("Enter cost per hour: ");
        double costPerHour = sc.nextDouble();

        AirFare flight;

        switch (choice) {
            case 1:
                flight = new AirIndia(hours, costPerHour);
                break;
            case 2:
                flight = new KingFisher(hours, costPerHour);
                break;
            case 3:
                flight = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        System.out.println("Flight Fare Details:");
        flight.display();

        sc.close();
    }
}