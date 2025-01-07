package designpattern.builder;

public class ItalianPizzaBuilder extends PizzaBuilder{

	@Override
	public void buildDough() {
		pizza.setDough("Cheese Burst");
	}

	@Override
	public void buildSauce() {
		pizza.setSauce("Italian");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("Ham+Pineapple");
	}

}
