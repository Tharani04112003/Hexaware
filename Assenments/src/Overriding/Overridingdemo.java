package Overriding;

public class Overridingdemo {

	public static void main(String[] args) {
		TwoWheeler wheeler = new  bike("rx","yamaha",900000) ;
		wheeler.printDetalis();
		wheeler.getMileage();
		
		String output [] = wheeler.showAcessories();
        for (String i : output) {
        	System.out.println(i);
        }
 
		
		

	}

}
