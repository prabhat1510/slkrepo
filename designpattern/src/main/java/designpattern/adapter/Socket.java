package designpattern.adapter;

public class Socket {
	public Volts getVolt() {
		return new Volts(120);
	}
}
