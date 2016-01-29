package components;

public class Case extends Product{
	
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
	public Case(String model, String maker, double price, String info,String type,String size, int quantity) {
		super(model, maker, price, info, quantity);
		this.type = type;
		this.size = size;
		super.setAvailable(true);
		
	}
	@Override
	public void printDetails() {
		System.out.println("***CASE***");
		System.out.println("Type: "+ type );
		super.printDetails();
	}
	
	

}
