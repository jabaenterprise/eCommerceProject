package shop;
import java.util.ArrayList;

import admin.Admin;
import components.*;
import user.Client;


public class DataBase {
	
	//Fields:
	private Inventory inventory;
	protected static ArrayList<Client> clients;
	private Admin admin;
	
	
	//Constructor:
	public DataBase() {
		this.inventory = new Inventory();
		DataBase.clients  = new ArrayList<Client>();
	}
	
	protected void setClients(ArrayList<Client> clients) {
		DataBase.clients = clients;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public void printInventoryContent() {
		inventory.printAllContent();
		
	}

	public static ArrayList<Client> getClients() {
		return DataBase.clients;
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
