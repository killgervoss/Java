package Question2;

import java.util.Scanner;

abstract class Vehicle {
    //Method to print vehicle details
	void printInfo() {
		System.out.println("Vehicle Details");
		
	}
	// Abstract method to print specific vehicle info
    abstract void vehicleInfo();
}

//Car class
class Car extends Vehicle{
	private String brand;
	private String model;
	private String price;
	private String availability;
	
	//Constructor
	public Car(String brand, String model, String price, String availability) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.availability = availability;
	}
	
	//Overridden method to print details
	public void vehicleInfo() {
		System.out.println("Car brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Availability: " + availability);
	}
	
    //Main method to take user input and display the details
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		
		//User input
		System.out.print("Enter car brand: ");
		String brand = scanner.nextLine();
		
		System.out.print("Enter car model: ");
		String model = scanner.nextLine();
		
		System.out.print("Enter car price: ");
		String price = scanner.nextLine();
		
		System.out.print("Car availability: ");
		String availability = scanner.nextLine();
		
		//Creating Car object
		Car car = new Car(brand, model, price, availability);
		
		//Printing details
		car.printInfo();
		car.vehicleInfo();
	}
}