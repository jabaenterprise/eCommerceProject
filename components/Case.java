package components;

public class Case extends Product{
	
	//Fields:
	private String type;
	private String size;
	/**
	 * @param model
	 * @param maker
	 * @param price
	 * @param info
	 * @param type
	 * @param size
	 */
	
	//Constructor:
	public Case(String model, String maker, double price, String info,String type,String size, int quantity) {
		super(model, maker, price, info, quantity);
		this.type = type;
		this.size = size;
		super.setAvailable(true);
		
	}
	
	//Methods:
	@Override
	public void printDetails() {
		System.out.println("***CASE***");
		System.out.println("Type: "+ this.type);
		System.out.println("Size: "+ this.size);
		super.printDetails();
	}
	
	

}
