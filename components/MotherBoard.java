package components;

public class MotherBoard extends Product{
	private String chipset;
	private String ramSlots;
	private String socketType;
	/**
	 * @param model
	 * @param maker
	 * @param price
	 * @param info
	 */
	public MotherBoard(String model, String maker, double price, String info, String chipset, String ramSlots, String socketType) {
		super(model, maker, price, info);
		this.chipset = chipset;
		this.ramSlots = ramSlots;
		this .socketType = socketType;
		super.setAvailable(true);
		
	}
	@Override
	public void printDetails() {
		System.out.println("Chipset: "+chipset);
		System.out.println("Ram Slots: " + ramSlots);
		System.out.println("Socket Type: " + socketType);
		super.printDetails();
	}

}
