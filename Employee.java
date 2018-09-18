package car_dealership;

public class Employee {
	
	////////////////
	// Properties //
	////////////////
	
	String name;
	double commission;
//	boolean clockedIn;
//	String makeExpertise;
	
	/////////////
	// Methods //
	/////////////

	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		double remainingCost = vehicle.getPrice() - cust.getCashOnHand();
		if (finance) {
			runCreditHistory(cust, remainingCost);
		} else if (vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, vehicle);
		} else {
			System.out.println(cust.getName() + " is short by $" + remainingCost + ".");
		}
	}
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Running credit history for " + cust.getName() + "...");
		System.out.println(cust.getName() + " has been approved for a loan of $" + loanAmount);
		System.out.println("Monthly installments (at 0% APR) equals $" + loanAmount / 60 
				+ " per month for 5 years (60 months)");
		
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println(cust.getName() + " has purchased the vehicle: "
				+ vehicle + " for the price of: $" + vehicle.getPrice());
		System.out.println(this.commission * 100 + "% commission for " + this.name + " = $" + this.commission * vehicle.getPrice());
	}
	
}
