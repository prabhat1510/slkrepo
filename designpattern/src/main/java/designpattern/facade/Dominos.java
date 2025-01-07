package designpattern.facade;

public class Dominos implements Franchise {

	@Override
	public void option() {
		System.out.println("Dominos");
	}

	@Override
	public void cost() {
		System.out.println("Rs 3,50,00,000");

	}

}
