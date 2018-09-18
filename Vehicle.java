package car_dealership;

public class Vehicle {
	
	////////////////
	// Properties //
	////////////////
	
	private String make;
	private String model;
	private double price;
	
	////////////////////////
	// Constructor method //
	////////////////////////
	
	public Vehicle(String make, String model, double price) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	/////////////////////////
	// Getters and Setters //
	/////////////////////////

	public double getPrice() {
		return price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	///////////////////
	// Other methods //
	///////////////////
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + "]";
	}

}
