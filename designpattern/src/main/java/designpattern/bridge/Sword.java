package designpattern.bridge;

public class Sword implements Weapon {

	private final Enchantment enchantment;
	
	public Sword(Enchantment enchantment) {
		this.enchantment=enchantment;
	}
	@Override
	public void weild() {
		System.out.println("The sword is wielded.");
		enchantment.onActivate();

	}

	@Override
	public void swing() {
		System.out.println("The sword is swinged.");
		enchantment.apply();

	}

	@Override
	public void unweild() {
		System.out.println("The sword is unwielded.");
		enchantment.onDeactivate();

	}

	@Override
	public Enchantment getEnhchantement() {
		
		return enchantment;
	}

}

