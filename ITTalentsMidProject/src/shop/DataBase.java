package shop;
import java.util.ArrayList;
import java.util.Scanner;

import admin.Admin;
import components.*;
import factories.ClientFactory;
import user.Client;


public class DataBase {
	static Scanner sc = new Scanner(System.in);	
	
	private static Inventory inventory = new Inventory();
	protected static ArrayList<Client> clients  = new ArrayList<Client>(); //this should become hashset so we can enter only clients with unique email
	private Admin admin;
	
	
	
	
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
	
	
	public Admin getAdmin(){
		return this.admin;
	}
	
	public void setAdmin(Admin admin){
		this.admin = admin;
	}
	
	
	public static boolean clientLogIn(String email, String password) {
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i).geteMail().equalsIgnoreCase(email)) {
				if (clients.get(i).getPassword().equals(password)) {
					clients.get(i).setLoggedIn(true);
					System.out.println("You have successfully logged in!");
					return true;
				} else {
					System.out.println("WRONG PASSWORD!");
					return false;
				}
			}

		}
		System.out.println("This e-mail is not in our database, do you want to register?");
		String answer  =sc.nextLine();
		System.out.println("name");
		String name = sc.nextLine();
		System.out.println("email");
		String email1 = sc.nextLine();
		System.out.println("password");
		String password1 = sc.nextLine();
	
		return clients.add(ClientFactory.createClient(name, password1, email1));
		

	}
	//method for calling the couriers
	/*
	 * public callCouriers(Cart clientCart, Address clientAddress){
	 * 
	 * 
	 * 
	 */

	

}
