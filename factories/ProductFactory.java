package factories;

import java.util.Scanner;

import components.CPU;
import components.Product;

public class ProductFactory {
	public static Scanner sc = new Scanner(System.in);

	public static Product createProduct(String componentType) {
		System.out.println("Enter maker");
		String maker = sc.nextLine();
		System.out.println("Enter model");
		String model = sc.nextLine();
		System.out.println("Enter price");
		double price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter info");
		String info = sc.nextLine();
		// make if statements for all of the components make all the inputs
		// strings and validate them when they need to be int or double with
		// parseInt and parseDouble
		if (componentType.equalsIgnoreCase("CPU")) {
			System.out.println("Enter number of cores");
			int numberOfCores = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter clock speed");
			double clockSpeed = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter socket type");
			String socket = sc.nextLine();
			return new CPU(model, maker, price, info, numberOfCores, clockSpeed, socket);

		}

		return null;

	}

}
