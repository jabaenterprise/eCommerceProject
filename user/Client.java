package user;

import java.util.Scanner;

import components.Product;

import exceptions.NotEnoughInStockException;

public class Client {
	
	private String eMail;
	private String password;
	private Address address;
	private String name;
//	private boolean isLoggedIn = false;
	Cart cart = new Cart();
	/**
	 * @param eMail
	 * @param password
	 * @param name
	 */
	public Client(String eMail, String password, String name) {
		this.eMail = eMail;
		this.password = password;
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Cart getCart() {
		return cart;
	}
	
	void addProductToCart(Product p, int amount){
		try {
			cart.addProduct(p, amount);
		} catch (NotEnoughInStockException e) {
			System.out.println(e.getMessage());
		}
	}
	
	void removeProductsFromCart(Product p, int amount){
		cart.removeProduct(p, amount);
	}
	
	void buyProducts(){
	//some sort of confirmation for correct address or if the user would like to change the address 
			if(address!=null)
				System.out.println("The amount you need to pay is: "+cart.calculateCost());
			else{
				System.out.println("you need to enter an address");
			}
		}	
	
	
	
	
	

}
