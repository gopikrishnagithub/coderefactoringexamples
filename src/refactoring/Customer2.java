package refactoring;

public abstract class Customer2 {
	
	private String custRating;
	static final int PREMIER = 2;
	static final int VALUED = 1;
	static final int DEADBEAT = 0;
	
	public String getCustRating(){ return custRating; }
	public void setCustRating(String custRating) { this.custRating = custRating; }
	
	public static void main(String[] args){
		CustomerFactory customerFactory  = new CustomerFactory();
		Customer2 goodCustomer = customerFactory.getCustomer("Premier");
		System.out.println("This Customers Rating: " + goodCustomer.getCustRating());
		Customer2 badCustomer = customerFactory.getCustomer("Deadbeat");
		System.out.println("This Customers Rating: " + badCustomer.getCustRating());
	}

}
