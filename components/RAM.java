package components;

public class RAM extends Product{

	private String type;
	private int size;
	
	/**
	 * @param model
	 * @param maker
	 * @param price
	 * @param info
	 */
	public RAM(String model, String maker, double price, String info, String type,int size) {
		super(model, maker, price, info);
		this.size = size;
		this.type = type;
		super.setAvailable(true);
		
		
		
	}
	@Override
	public void printDetails() {
		System.out.println("***RAM***");
		System.out.println("Type: "+type);
		System.out.println("Size: " + size+"GB");
		super.printDetails();
	}
	
	
	
}
