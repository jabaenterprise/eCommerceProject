package components;

import java.io.IOException;

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
	
	public Product(String model, String maker, double price,String info) {
		
		this.model = model;
		this.maker = maker;
		this.price = price;
		this.info = info; 
		this.quantity = 0;
	
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
