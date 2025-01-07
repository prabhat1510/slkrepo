package designpattern.cake;

public class BlueBerry extends Cake {

	public BlueBerry() {
		setName("BlueBerry");
		setType("Eggless");
		setPrice(1800);
	}

	@Override
	public void recipe() {
		System.out.println("------------BlueBerry Recipe---------");
		System.out.println("First prepare Flour and Baking Powder mixture");
		System.out.println("Add Milk and Egg yolks");
		System.out.println("Coat Berries");
		System.out.println("Bake for 50minutes");

	}

	@Override
	public void myFans() {
		System.out.println("Moms love me");

	}

}
