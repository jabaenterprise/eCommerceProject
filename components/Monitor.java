package components;

public class Monitor extends Product{
	
	private double size;
	private int refreshRate;
	private String matrixType;
	public Monitor(String model, String maker, double price, String info, double size,int refreshRate,String matrixType ) {
		super(model, maker, price, info);
		this.size = size;
		this.refreshRate = refreshRate;
		this.matrixType = matrixType;
		super.setAvailable(true);
		
	}
	@Override
	public void printDetails() {
		System.out.println("***MONITOR***");
		super.printDetails();
		System.out.println("Size: " + size+"\"");
		System.out.println("Matrix type: "+matrixType);
		System.out.println("Refresh Rate: " + refreshRate+"ms");
	
		
	}

}
