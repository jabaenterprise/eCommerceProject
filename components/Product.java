package components;

import java.io.IOException;

import exceptions.InvalidPriceException;
import exceptions.InvalidQuantityValueException;

public  class Product {
	private String model;
	private String maker;
	private double price;
	private String info;
	private int quantity;
	private boolean isAvailable;
	/**
	 * @param model
	 * @param maker
	 * @param price
	 * @param info
	 */
	
	public Product(String model, String maker, double price, String info, int quantity) {
		
		this.model = model;
		this.maker = maker;
		if (price > 0) {
			this.price = price;
		} else {
			try {
				throw new InvalidPriceException("Invalid input value for " + this.maker + " " + this.model + " price.");
			} catch (InvalidPriceException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		this.info = info;  
		if (quantity > 0) {
				this.quantity = quantity;
	
		} else {
			try {
				throw new InvalidQuantityValueException ("Invalid input value for " + this.maker + " " + this.model + " quantity.");
			} catch (InvalidQuantityValueException e) {
				System.out.println(e.getMessage());
			}
		}
	
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) throws IOException {
		if(quantity>0){
			this.quantity = quantity;
			isAvailable = true;
			return;
		}
			
		
		if(quantity==0){
			this.quantity=quantity;
			isAvailable = false;
			return;
		}
		if(quantity<0){
			throw new IOException("Not Enough in Stock"); 
		}
	}

	
	

	public void printDetails() {
		System.out.println("Model: " +model);
		System.out.println("Maker: " +maker);
		System.out.println("Price: " +"$"+price);
		System.out.println("Info: " +info);
		System.out.println(isAvailable?"In Stock":"Out of Stock");
		System.out.println("qantity: "+ quantity);
		
	}
	

}
