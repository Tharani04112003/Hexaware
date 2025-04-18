package Abstract;

public abstract class Mobile {

	String model;
	String Brand;
	String price;

public Mobile (String model,String brand, double price) {
	super();
	this.model=model;
	this.Brand=brand;
	this.price=price;
}
void printDetails() {
	System.out.println("meodel"+model);
	System.out.println("Brand"+Brand);
	System.out.println("price"+price);
}
 abstract void showFeatures() {
	System.out.println("memory , camera");
}
 abstract String[]showAcessories(){
	String[]acessories = {"charger","Mobile case"};
	return acessories;
}
}