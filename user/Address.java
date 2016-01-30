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
	public Address(String contactName, String city, String addressLine1, String addressLine2, String postalCode, String telephoneNumber) {
		
		this.contactName = contactName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.postalCode = postalCode;
		this.telephoneNumber = telephoneNumber;
	}
	protected String getContactName() {
		return contactName;
	}
	protected String getCity() {
		return city;
	}
	protected String getAddressLine1() {
		return addressLine1;
	}
	protected String getAddressLine2() {
		return addressLine2;
	}
	protected String getPostalCode() {
		return postalCode;
	}
	protected String getTelephoneNumber() {
		return telephoneNumber;
	}
	
	

}
