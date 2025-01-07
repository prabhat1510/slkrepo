package designpattern.facade;

public class FranchiseServiceReg {
	
	private Franchise KFC;
	private Franchise McDonalds;
	private Franchise Dominos;
	
	public FranchiseServiceReg() {
		KFC = new KFC();
		McDonalds =new McDonalds();
		Dominos = new Dominos();
		
	}
	
	public void BuyKFCFranchise() {
		KFC.option();
		KFC.cost();
	}
	public void BuyMcDonaldsFranchise() {
		McDonalds.option();
		McDonalds.cost();
	}
	public void BuyDominosFranchise() {
		Dominos.option();
		Dominos.cost();
	}

}
