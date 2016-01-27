package components;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List; 

public class Inventory {

		private static final int CASE = 0;
		private static final int CPU = 1;
		private static final int GPU = 2;
		private static final int HARDDRIVE = 3;
		private static final int MONITOR = 4;
		private static final int MOTHERBOARD = 5;
		private static final int RAM = 6;

		private ArrayList<ArrayList<Product>> products = new ArrayList<ArrayList<Product>>();

		
		public void generateArray(){
			
			for(int i=0; i<RAM+1;i++){
				products.add(new ArrayList<Product>());
			}			
		}
		
		public void addProd(Product p, int amount){
			int select = 0;
			if (p instanceof Case){select = CASE;}
			if (p instanceof CPU){select = CPU;}
			if (p instanceof GPU){select = GPU;}
			if (p instanceof HardDrive){select = HARDDRIVE;}
			if (p instanceof Monitor){select = MONITOR;}
			if (p instanceof MotherBoard){select = MOTHERBOARD;}
			if (p instanceof RAM){select = RAM;}
			
			for(int i = 0; i < products.get(select).size();i++){
				if (( products.get(select).get(i)).getModel().equals(p.getModel())){
					try {
						( products.get(select).get(i)).setQuantity((products.get(select).get(i)).getQuantity()+amount);
					} catch (IOException e) {
						System.out.println("smth wrong-------------------------------------------------");
						e.printStackTrace();
					}
					return;
				}
			}
			try {
				p.setQuantity(amount);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			products.get(select).add(p);
			
			
		}
		public void removeProduct(Product p, int amount) {
			int select = findProductType(p);
			for(int i = 0; i<products.get(select).size();i++){
				if(products.get(select).get(i).getModel().equals(p.getModel())){
					System.out.println("removing");
					try {
						products.get(select).get(i).setQuantity(products.get(select).get(i).getQuantity()-amount);
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			}
			
		}
		
		public void printByComponent(String component) throws Exception{
			int select=-1;
			switch(component){
			case "CPU":
				select = CPU;
				break;
			case "GPU":
				select = GPU;
				break;
			case "Hard Drives":
				select = HARDDRIVE;
				break;
			case "Monitor":
				select = MONITOR;
				break;
			case "MotherBoard" :
				select = MOTHERBOARD;
				break;
			case "RAM":
				select = RAM;
				break;
				default:
					select = -1;
			}
			if (select!=-1){
				for (int i = 0;i<products.get(select).size();i++){
					products.get(select).get(i).printDetails();
				}
			}
			else
			{
				System.out.println("Input not recognised");
			}
			
			
		}
		public void printAllContent() {
			for(int i = 0;i<products.size();i++){
				for (int j = 0; j<products.get(i).size();j++){
					products.get(i).get(j).printDetails();
				}
			}
			
		}
		
		
		public int findProductType(Product p){
			int select = -1;
			if (p instanceof Case){select = CASE;}
			if (p instanceof CPU){select = CPU;}
			if (p instanceof GPU){select = GPU;}
			if (p instanceof HardDrive){select = HARDDRIVE;}
			if (p instanceof Monitor){select = MONITOR;}
			if (p instanceof MotherBoard){select = MOTHERBOARD;}
			if (p instanceof RAM){select = RAM;}
			return select;
		}
		
		

}
