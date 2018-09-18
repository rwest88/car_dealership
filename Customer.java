package car_dealership;

public class Customer {
	
	////////////////
	// Properties //
	////////////////
	
	private String name;
	private String address;
	private double cashOnHand;
//	private int creditScore;
//	private int budgetMin;
//	private int budgetMax;
//	String makeSeeking;
	
	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handleCustomer(this, finance, vehicle);
	}

	/////////////////////////
	// Getters and Setters //
	/////////////////////////

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	
}
