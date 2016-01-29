package exceptions;

public class InvalidPriceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6932141145472640888L;
	
	public InvalidPriceException(){
		super("Negative price");
	}
	public InvalidPriceException(String message){
		super(message);	
	}
	

}
