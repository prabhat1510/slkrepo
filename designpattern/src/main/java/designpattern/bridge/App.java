package designpattern.bridge;

/**
 * 
 * Bridge Design Pattern-- Composition over Inheritance. The Bridge pattern can
 * also be thought of as two layers of abstraction. With this, you can decouple
 * an abstraction from its implementation so that the two can vary independently
 * 
 * In this example i am going to have two class hierarchies. One of weapons and
 * another one of enchantments. We can easily combine any weapon with any
 * enchantments using composition instead of creating deep class hierarchy.
 * 
 * In Bridge pattern both abstraction (Weapon) and implementation(Enchantment)
 * have their own class hierarchies.The interface of the implementations can be
 * changed without affecting the clients
 *
 */
public class App {
	public static void main(String[] args) {
		Weapon enchantedSword = new Sword(new SoulEatingEnchantment());
		enchantedSword.weild();
		enchantedSword.swing();
		enchantedSword.unweild();
		
		Weapon enchantedHammer = new Hammer(new FlyingEnchantment());
		enchantedHammer.weild();
		enchantedHammer.swing();
		enchantedHammer.unweild();
	}
}
