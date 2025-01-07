package designpattern.decorator;

public class CarDecorator implements Car{
	//HAS- A relationship
	protected Car car;

	
	public CarDecorator(Car car) {
		this.car = car;
	}


	@Override
	public void assemble() {
		this.car.assemble();
		
	}

}
