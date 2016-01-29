package shop;
import java.util.ArrayList;

import admin.Admin;
import components.*;
import user.Client;


public class DataBase {
	private static Inventory inventory = new Inventory();
	protected static ArrayList<Client> clients  = new ArrayList<Client>();
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
	
	//method for calling the couriers
	/*
	 * public callCouriers(Cart clientCart, Address clientAddress){
	 * 
	 * 
	 * 
	 */

	

}
