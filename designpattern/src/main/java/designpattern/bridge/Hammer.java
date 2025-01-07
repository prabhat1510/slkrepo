package designpattern.bridge;

public class Hammer implements Weapon {

	private final Enchantment enchantment;
	
	public Hammer(Enchantment enchantment) {
		this.enchantment=enchantment;
	}
	@Override
	public void weild() {
		System.out.println("The hammer is wielded.");
		enchantment.onActivate();

	}

	@Override
	public void swing() {
		System.out.println("The hammer is swinged.");
		enchantment.apply();

	}

	@Override
	public void unweild() {
		System.out.println("The hammer is unwielded.");
		enchantment.onDeactivate();

	}

	@Override
	public Enchantment getEnhchantement() {
		
		return enchantment;
	}

}
