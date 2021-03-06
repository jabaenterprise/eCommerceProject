package user;
import java.io.IOException;
import java.util.ArrayList;
import components.CPU;
import components.Case;
import components.GPU;
import components.HardDrive;
import components.Monitor;
import components.MotherBoard;
import components.Product;
import components.RAM;

import exceptions.NotEnoughInStockException;

public class Cart {

	private ArrayList<Product> cart  = new ArrayList<Product>();
	
	
	public void addProduct(Product p, int amount) throws NotEnoughInStockException{
		if (amount<=0){
			throw new NotEnoughInStockException("You are trying to add 0 or less products.");
		}
		
		if (p.getQuantity() < amount) {
			throw new NotEnoughInStockException("Not enough products in stock.");
		}
		
		cart.add(p);
		try {
			cart.get(cart.size()-1).setQuantity(amount); //Here, by setting the quantity of the product in the cart we change that value in the Data Base... we should correct that!
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	public void removeProduct(Product p, int amount){
		for(int i = 0; i<cart.size();i++){
			if(cart.get(i).getModel().equals(p.getModel())&&amount>0){
				cart.remove(i);
							
			}
		}
	}
	public double calculateCost() {
		double cost = 0;
		for(int i = 0; i<cart.size();i++){
			cost += cart.get(i).getPrice();
		}
		System.out.println("Cost: " + cost);
		return cost;
	}
	public void printCart(){
		for(int i=0; i<cart.size();i++){
			cart.get(i).printDetails();
		}
	}
}
