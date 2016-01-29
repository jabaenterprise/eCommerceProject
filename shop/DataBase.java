package shop;

import java.util.ArrayList;

import components.*;
import factories.ClientFactory;
import factories.ProductFactory;
import user.Client;

public class DataBase {
	private static Inventory inventory = new Inventory();
	protected static ArrayList<Client> clients = new ArrayList<Client>();

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public void printInventoryContent() {
		inventory.printAllContent();

	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void showAllComponents() {
		inventory.printAllContent();

	}

	public void clientLogIn(String email, String password) {
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).geteMail().equalsIgnoreCase(email)) {
				if (clients.get(i).getPassword().equals(password)) {
					clients.get(i).setLoggedIn(true);
					System.out.println("You have successfully logged in!");
					return;
				} else {
					System.out.println("WRONG PASSWORD!");
				}
			}

		}
		System.out.println("This e-mail is not in our database, do you want to register?");

		String name = "xxx";
		String password1 = "xxx1X";
		String email1 = "XXX@xxx.com";
		clients.add(ClientFactory.createClient(name, password1, email1));

	}

	public void addComponent(Product p, int amount) {
		if (p != null)
			inventory.addProd(p, amount);
	}

	public void addComponent(int amount) {
		System.out.println("Enter product type");
		String type = ProductFactory.sc.nextLine();

		if (type.equalsIgnoreCase("CASE") || type.equalsIgnoreCase("cpu") || type.equalsIgnoreCase("gpu")
				|| type.equalsIgnoreCase("harddrive") || type.equalsIgnoreCase("monitor")
				|| type.equalsIgnoreCase("motherboard") || type.equalsIgnoreCase("ram")){
			
			inventory.addProd(ProductFactory.createProduct(type), amount);
		}
		else
		{
			System.out.println("No such product in the system!");
		}

			

	}

	public void removeComponent(Product p, int amount) {
		inventory.removeProduct(p, amount);
	}

	public void registerClient(String name, String password, String email) {
		Client newClient = ClientFactory.createClient(name, password, email);
		if (newClient != null) {
			System.out.println("Client added");
			clients.add(newClient);
		}

	}
	// method for calling the couriers
	/*
	 * public callCouriers(Cart clientCart, Address clientAddress){
	 * 
	 * 
	 * 
	 */

}
