package designpattern.decorator;

public class SportsCar extends CarDecorator{

	public SportsCar(Car car) {
		super(car);
		
	}
	
	public void assemble() {
		super.assemble();
		System.out.println("Addign features of Sports Car.");
	}

}
