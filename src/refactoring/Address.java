package refactoring;

public class Address {

	private String street = "";
	private String city = "";
	private String state = "";
	private int postalCode = 0;

	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public Address(String street, String city, String state, int postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public String toString() {

		return getStreet() + " " + getCity() + " " + getState() + " " + getPostalCode();

	}

}
