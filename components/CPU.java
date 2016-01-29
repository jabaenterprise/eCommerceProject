package components;

public class CPU extends Product {
	
	private int numberOfCores;
	private double clockSpeed;
	private String socket;
	
	public CPU(String model, String maker, double price, String info,int numberOfCores, double clockSpeed, String socket) {
		super(model, maker, price, info);
		super.setAvailable(true);
		this.numberOfCores = numberOfCores;
		this.clockSpeed = clockSpeed;
		this.socket = socket;
		
	}

	@Override
	public void printDetails() {

		System.out.println("***CPU***");
		super.printDetails();
		System.out.println("Number Of Cores: " + numberOfCores);
		System.out.println("Clock Speed: "+clockSpeed+"GHz");
		System.out.println("socket: " + socket);
	}
	

	

}
