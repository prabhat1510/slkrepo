package designpattern.adapter;

public class Demo {
	public static void main(String[] args) {
		
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();
		Volts v3 = getVolt(sockAdapter,3);
		System.out.println(v3.getVolts());
		Volts v12 = getVolt(sockAdapter,12);
		System.out.println(v12.getVolts());
		
		Volts v120 = getVolt(sockAdapter,120);
		System.out.println(v120.getVolts());
	}

	private static Volts getVolt(SocketAdapter sockAdapter, int i) {
		switch(i) {
		
		case 3 : return sockAdapter.get3Volt();
		case 12 : return sockAdapter.get12Volt();
		case 120 : return sockAdapter.get120Volt();
		default : return sockAdapter.get120Volt();
		}
	}
}
