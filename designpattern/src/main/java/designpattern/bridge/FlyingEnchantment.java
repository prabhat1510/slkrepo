package designpattern.bridge;

public class FlyingEnchantment implements Enchantment {

	@Override
	public void onActivate() {
		System.out.println("The item spread bloodlust.");

	}

	@Override
	public void apply() {
		System.out.println("The item eats the soul of enemies.");

	}

	@Override
	public void onDeactivate() {
		System.out.println("Bloodlust slowly disappears");

	}

}
