package Abstract;

public class Smartphone extends Mobile {
	public SmartPhone(String model,String brand,double price);

	@Override
	void showFeatures() {
		System.out.println("camera,Bass sound");
		// TODO Auto-generated method stub

	}

	@Override
	String[] showAcessories() {
		// TODO Auto-generated method stub
		return new String[] {"screen Gaurd","Charger"};
	}

}
