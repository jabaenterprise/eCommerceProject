package admin;

import java.io.IOException;
import java.util.List;

import components.Inventory;
import components.Product;
import exceptions.InvalidPriceException;
import user.Client;

public class Admin {

	private String name;
	private String email;
	private String password;

	public Admin(String email, String password) {
		this.email = email;
		this.password = password;
		this.name = "";
	}

	public void changeName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public String getEmail() {
		return this.email;
	}

	public String getName() {
		return this.name;
	}

	public void removeUser(List<Client> clients, Client client)
			throws IllegalArgumentException {
		if (client != null) {
			for(int i = 0; i<clients.size(); i++){
				if(clients.get(i)!=null){
					if(clients.get(i).geteMail().equals(client.geteMail())){
						clients.remove(i);
					}
				}
			}
		} else {
			throw new IllegalArgumentException("client can not be null");
		}

	}

	public void removeUserById(List<Client> clients, int id)
			throws IllegalArgumentException {
		if (id >= 0 && id < clients.size()) {
			clients.remove(id);
		} else {
			throw new IllegalArgumentException(
					"id must be positive and less than client's size");
		}
	}

	public void removeProduct(Inventory inventory, Product product) throws IllegalArgumentException {
		if (product != null) {
			inventory.getProductList(product).remove(product);
		} else {
			throw new IllegalArgumentException("product can not be null");
		}

	}

	public void removeProductById(Inventory inventory, int type, int id)
			throws IllegalArgumentException {
		
		if(inventory.getProductList(type)!=null){
			if (id >= 0 && id < inventory.getProductList(type).size()) {
				inventory.getProductList(type).remove(id);
			} else {
				throw new IllegalArgumentException(
						"id must be positive and less than products' size");
			}
		}
		
	}

	public void addProduct(Inventory inventory, Product product)
			throws IllegalArgumentException {
		if (product != null) {
			inventory.addProd(product, 0);
		} else {
			throw new IllegalArgumentException("Product can not be null");
		}
	}

	public void changeProductPrice(Inventory inventory, int type, int id, double price)
			throws IllegalArgumentException, InvalidPriceException {
		if(inventory.getProductList(type)!=null){
			if (id >= 0 && id < inventory.getProductList(type).size()) {
				if (price > 0) {
					inventory.getProductList(type).get(id).setPrice(price);
				} else {
					throw new InvalidPriceException("Price can not be negative");
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void changeProductQuantity(Inventory inventory, Product product, int quantity) throws IllegalArgumentException {
		if (quantity > 0) {
			if (product != null) {
				System.out.println("changing product quantity");				
				List<Product> products = inventory.getProductList(product);
				for(Product p: products){
					if(p.getModel().equals(product.getModel())){
						try {
							p.setQuantity(quantity);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			} else {
				throw new IllegalArgumentException("Product can not be null");
			}
		} else {
			throw new IllegalArgumentException(
					"Quantity can not be negative ot zero");
		}
	}

	public void changeProductQuantityById(Inventory inventory, int type, int id, int quantity) throws IllegalArgumentException{	
		if(inventory.getProductList(type)!=null){
			if (quantity > 0) {
				if (id >= 0 && id < inventory.getProductList(type).size()) {
					try {
						inventory.getProductList(type).get(id).setQuantity(quantity);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}else{
					throw new IllegalArgumentException("id must be positive and less than products' size ");
				}
			}
			else{
				throw new IllegalArgumentException("Quantity must be positive");
			}
		}
	}

	public void changeProductInfoById(Inventory inventory,int type, int id, String info){
		if(inventory.getProductList(type)!=null){
			if (id >= 0 && id < inventory.getProductList(type).size()) {
				inventory.getProductList(type).get(id).setInfo(info);
			}else{
				throw new IllegalArgumentException("id must be positive and less than products' size ");
			}
		}
	}
}
