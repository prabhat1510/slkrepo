package designpattern.flyweight;

public class ClientApp {

	public static void main(String[] args) {
	 Pen yellowThinPen1 = PenFactory.getThinPen("Yellow");//created new pen
	 yellowThinPen1.draw("Hello Everyone");
	 
	 
	 Pen yellowThinPen2 = PenFactory.getThinPen("Yellow");//shared pen
	 yellowThinPen2.draw("Hello Everyone");
	 
	 Pen blueThinPen = PenFactory.getThinPen("Blue");//create new pen
	 blueThinPen.draw("Hello Everyone");
	 
	 System.out.println(yellowThinPen1.hashCode());
	 System.out.println(yellowThinPen2.hashCode());
	 System.out.println(blueThinPen.hashCode());

	}

}
