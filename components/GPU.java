package components;

public class GPU extends Product{
	private int memorySize;
	private String maxResolution;
	private String outputInterface;
	/**
	 * @param model
	 * @param maker
	 * @param price
	 * @param info
	 */
	public GPU(String model, String maker, double price, String info, int memorySize,String maxResolution, String outputInterface) {
		super(model, maker, price, info);
		this.maxResolution = maxResolution;
		this.memorySize = memorySize;
		this.outputInterface = outputInterface;
		super.setAvailable(true);
		
	}
	@Override
	public void printDetails() {
		System.out.println("***GPU***");
		super.printDetails();
		System.out.println("Memory size: " + memorySize+"GB");
		System.out.println("Max Resolution: "+maxResolution);
		System.out.println("Output Interface: " + outputInterface);
	}
	
	
	
	
}
