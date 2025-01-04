package com.test.project;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Showroom showroom = new Showroom();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nCar Showroom Management");
	            System.out.println("1. Add Car");
	            System.out.println("2. View Cars");
	            System.out.println("3. Delete Car");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Car ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); // Clear newline
	                    System.out.print("Enter Car Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Car Model: ");
	                    String model = scanner.nextLine();
	                    System.out.print("Enter Car Price: ");
	                    double price = scanner.nextDouble();

	                    Car car = new Car(id, name, model, price);
	                    showroom.addCar(car);
	                    break;

	                case 2:
	                    showroom.viewCars();
	                    break;

	                case 3:
	                    System.out.print("Enter Car ID to delete: ");
	                    int deleteId = scanner.nextInt();
	                    showroom.deleteCar(deleteId);
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	}

}
