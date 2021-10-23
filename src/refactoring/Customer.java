package refactoring;

public class Customer {

	private String firstName = "";
	private String lastName = "";
	private Address address = null;
	private Birthday birthDay = null;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Customer(String firstName, String lastName, String street, String city, String state, int postalCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = new Address(street, city, state, postalCode);
	}

	public Customer(String firstName, String lastName, Address address, Birthday birthDay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.birthDay = birthDay;
	}

	public static void main(String[] args) {
		Customer sallySmith = new Customer("Sally", "Smith", "123 Main St", "Perry", "Iowa", 50220);
		System.out.println("Customer Name: " + sallySmith.getFirstName() + " " + sallySmith.getLastName());
		System.out.println("Address: " + sallySmith.address.getStreet() + " " + sallySmith.address.getCity() + " "
				+ sallySmith.address.getState() + " " + sallySmith.address.getPostalCode());
		Address markJonesAddress = new Address("123 Main St", "Perry", "Iowa", 50220);
		Birthday markJonesBirthday = new Birthday(12, 21, 1974);
		Customer markJones = new Customer("Mark", "Jones", markJonesAddress, markJonesBirthday);
		System.out.println(markJones.birthDay);
		System.out.println(markJones.birthDay.getBirthDate());
		System.out.println(markJones.address);

	}
}
