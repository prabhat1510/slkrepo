package designpattern.cake;

public class LitchiGateaux extends Cake {

	public LitchiGateaux() {
		setName("Litchi Gateaux");
		setType("Eggless");
		setPrice(1750);
	}

	@Override
	public void recipe() {
		System.out.println("------------LitchiGateaux Recipe---------");
		System.out.println("Take some fresh Litchies");
		System.out.println("Wash them and Grind for 5 minutes");
		System.out.println("Put some groundnuts and bake for 45 minutes");
		System.out.println("Chill and Serve");

	}

	@Override
	public void myFans() {
		System.out.println("Litchi love me");

	}

}
