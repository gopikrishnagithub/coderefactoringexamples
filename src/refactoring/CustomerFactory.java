package refactoring;

public class CustomerFactory {

	public Customer2 getCustomer(int custType) {
		switch (custType) {
		case 2:
			return new Premier();
		case 0:
			return new Deadbeat();
		default:
			throw new IllegalArgumentException("Invalid Customer Type");
		}
	}

	public Customer2 getCustomer(String custName) {
		try {
			return (Customer2) Class.forName(custName).newInstance();
		}
		catch (Exception e) {
			throw new IllegalArgumentException("Invalid Customer Type");
		}
	}
}
