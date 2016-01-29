package user;

import java.util.Scanner;

import components.Product;
import exceptions.NotEnoughInStockExceptio;

public class Client {
	Scanner sc = new Scanner(System.in);
	private static final double SHIPPING_FEE = 5.95;
	private String eMail;
	private String password;
	private Address address;
	private String name;
	private boolean isLoggedIn = false;
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
	
	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
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
		} catch (NotEnoughInStockExceptio e) {
			System.out.println(e.getMessage());
		}
	}
	
	void removeProductsFromCart(Product p, int amount){
		cart.removeProduct(p, amount);
	}
	
	 public void buyProducts(){
	//some sort of confirmation for correct address or if the user would like to change the address 
			if(address!=null)
				System.out.println("The amount you need to pay with shipping fee is: "+(cart.calculateCost()+SHIPPING_FEE));
			else{
				System.out.println("Enter contact name");
				String contactName = sc.nextLine();
				address.setContactName(contactName);
				System.out.println("you need to enter an address");
				address = new Address();
				System.out.println("You must enter city!");
				String city=sc.nextLine();
				address.setCity(city);
				System.out.println("You must enter Address Line 1!");
				String addressLine1 = sc.nextLine();
				address.setAddressLine1(addressLine1);
				System.out.println("You must enter Address Line 2!");
				String addressLine2 = sc.nextLine();
				address.setAddressLine1(addressLine2);
				System.out.println("You must enter Postal Code!");
				String postalCode = sc.nextLine();
				address.setPostalCode(postalCode);
				System.out.println("You must enter Telephone Number!");
				String telephoneNumber = sc.nextLine();
				address.setTelephoneNumber(telephoneNumber);
			}
		}	
	
	
	
	
	

}
