package designpattern.adapter;
//Adapter class
public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volts get120Volt() {
		return getVolt();
	}

	@Override
	public Volts get12Volt() {
		Volts v = getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volts get3Volt() {
		Volts v = getVolt();
		return convertVolt(v,40);
	}
	
	private Volts convertVolt(Volts v, int i) {
		return new Volts(v.getVolts()/i);
	}

}
