package user;

public class Address {
	private String contactName;
	private String city;
	private String addressLine1;
	private String addressLine2;
	private String postalCode;
	private String telephoneNumber;
	/**
	 * @param contactName
	 * @param city
	 * @param addressLine1
	 * @param addressLine2
	 * @param postalCode
	 * @param telephoneNumber
	 */
	public Address(){}
	public Address(String contactName, String city, String addressLine1, String addressLine2, String postalCode,String telephoneNumber) {
		if(contactName!=null&&city!=null&&addressLine1!=null&&addressLine2!=null&&postalCode!=null&&telephoneNumber!=null){
			this.contactName = contactName;
			this.city = city;
			this.addressLine1 = addressLine1;			
			this.addressLine2 = addressLine2;			
			this.postalCode = postalCode;
			this.telephoneNumber = telephoneNumber;
		}
		else{
			System.out.println("Invalid input");
			return;
		}
		
		
		
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		if(contactName!=null)
			this.contactName = contactName;
		else
			System.out.println("You must enter a contact name!");
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		if(contactName!=null)
			this.city = city;	
		else
			System.out.println("You must enter city!");
	
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		if(addressLine1!=null)
		this.addressLine1 = addressLine1;
		else
			System.out.println("You must enter Address Line 1!");
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		if(addressLine2!=null)
		this.addressLine2 = addressLine2;
		else
			System.out.println("You must enter Address Linea2");
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		if(postalCode!=null)
			this.postalCode = postalCode;
		else
			System.out.println("You must enter Postal Code!");
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		if(telephoneNumber!=null)
			this.telephoneNumber = telephoneNumber;
		else
			System.out.println("You must enter Telephone Number!");
	}
	
	

}
