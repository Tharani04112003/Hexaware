package Overriding;

public class TwoWheeler {
	String model;
	String brand;
	Double price;
	
	public TwoWheeler (String model,String brand, double price) {
		super();
		this.model=model;
		this.brand=brand;
		this.price=price;
	}
	void getMileage() {
		System.out.println("good milege");
	}
	String[]showAccessories(){
		String[]accessories = {"seat cover, Gloves"};
		return accessories;
	}

}
