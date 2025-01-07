package designpattern.facade;

public class McDonalds implements Franchise {

	@Override
	public void option() {
		System.out.println("Mc Donalds");
	}

	@Override
	public void cost() {
		System.out.println("Rs 4,60,00,000");

	}

}
