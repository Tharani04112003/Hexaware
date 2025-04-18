package Overriding;

public class Scooty extends TwoWheeler {

    String[] accessories;

    public Scooty(String model, String brand, double price) {
        super(model, brand, price);
        accessories = new String[] { "Footrest", "Mirror" };
    }


    public String[] showAccessories() {
        return accessories;
    }
}