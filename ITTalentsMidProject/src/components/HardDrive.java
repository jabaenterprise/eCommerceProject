package components;

public class HardDrive extends Product{
	private String type;
	private int size;
	private int capacity;
	/**
	 * @param model
	 * @param maker
	 * @param price
	 * @param info
	 * @param type
	 * @param size
	 * @param capacity
	 */
	public HardDrive(String model, String maker, double price, String info,String type, int size, int capacity, int quantity) {
		super(model, maker, price, info, quantity);
		this.size = size;
		this.capacity = capacity;
		this.type = type;
		super.setAvailable(true);
	}
	@Override
	public void printDetails() {
		System.out.println("***HARD DRIVE***");
		super.printDetails();
		System.out.println("Size:" + size+"\"");
		System.out.println("Type: "+type);
		System.out.println("Capacity:" + capacity+"GB");
		super.printDetails();
	}
	

}
