package user;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import components.Product;


import exceptions.NotEnoughInStockException;

public class Cart {

	//Fields:
	private HashMap<Product, Integer> cart  = new HashMap<Product, Integer>();
	private Client user;
	
	
	
	//Getters:
	protected Client getUser() {
		return user;
	}

	//Setters:
	protected void setUser(Client user) {
		this.user = user;
	}
	
	
	
	//Methods:
	public void addProduct(Product p, int amount) throws NotEnoughInStockException{
		if (amount<=0){
			throw new NotEnoughInStockException("Can't add 0 or negative number of products.");
		} 
		
		if (p.getQuantity() < amount) {
			throw new NotEnoughInStockException("Not enough products in stock.");
		}
		
		cart.put(p, amount);
	}
	
	public void removeProduct(Product p, int amount){
		cart.remove(p);
	}
	
	public double calculateCost() {
		double cost = 0;
		
		for(Iterator<Entry<Product, Integer>> it = cart.entrySet().iterator(); it.hasNext();){
			Map.Entry<Product, Integer> pair = (Map.Entry<Product, Integer>)it.next();
			cost+= pair.getKey().getPrice()*pair.getValue();
		}
		
		return cost;
	}
	
	public void printCart(){
		for(Iterator<Entry<Product, Integer>> it = cart.entrySet().iterator(); it.hasNext();){
			Map.Entry<Product, Integer> pair = (Map.Entry<Product, Integer>)it.next();
			pair.getKey().printDetails();
		}
	}


}
