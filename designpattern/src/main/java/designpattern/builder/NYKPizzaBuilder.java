package designpattern.builder;

public class NYKPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("Pan Baked");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Hot");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Pepperoni+Salami");
	}

}
