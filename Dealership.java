package car_dealership;

// PROJECT: Write a program to simulate a car dealership sales process. 
//          We'll have Employees selling Vehicles to Customers.

public class Dealership {

	public static void main(String[] args) {
		
		Customer joeBob = new Customer();
		joeBob.setName("JoeBob Bobbertson");
		joeBob.setAddress("2152 Bob Drive, Robertsville, VA 23456");
		joeBob.setCashOnHand(12000);
//		joeBob.setCreditScore(800);
		
		Customer meg = new Customer();
		meg.setName("Meg Ryan");
		meg.setCashOnHand(14000);
		
		Customer drGetMoney = new Customer();
		drGetMoney.setName("Dr. Get-Money");
		drGetMoney.setCashOnHand(80000);
		
		Vehicle hondaCivic = new Vehicle("Honda", "Civic", 17000);
		Vehicle hondaAccord = new Vehicle("Honda", "Accord", 19000);
		Vehicle nissanVersa = new Vehicle("Nissan", "Versa", 11500);
		Vehicle nissanSentra = new Vehicle("Nissan", "Sentra", 13000);
		Vehicle nissanAltima = new Vehicle("Nissan", "Altima", 19000);
		Vehicle nissanMaxima = new Vehicle("Nissan", "Maxima", 21000);
		
		Employee rick = new Employee();
		rick.name = "Rick Sanchez";
		rick.commission = 0.03;
		
		Employee hank = new Employee();
		hank.name = "Hank Hill";
		hank.commission = 0.05;
		
		joeBob.purchaseCar(nissanAltima, rick, false);
		joeBob.purchaseCar(hondaCivic, rick, false);
		joeBob.purchaseCar(nissanVersa, rick, false);
		
		meg.purchaseCar(hondaAccord, hank, false);
		meg.purchaseCar(hondaAccord, hank, true);
		
		drGetMoney.purchaseCar(nissanMaxima, hank, false);
		drGetMoney.purchaseCar(nissanAltima, hank, false);
		drGetMoney.purchaseCar(nissanSentra, hank, false);
	}

}
