package designpattern.decorator;

public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car car) {
		super(car);
		
	}
	
	public void assemble() {
		super.assemble();
		System.out.println("Addign features of Luxury Car.");
	}

}
