package designpattern.flyweight;

import java.util.HashMap;

public class PenFactory {
	private static final HashMap<String,Pen> pensMap=new HashMap<String,Pen>();
	
	public static Pen getThickPen(String color) {
		String key = color+" - Thick";
		Pen pen = pensMap.get(key);
		if(pen!=null) {
			return pen;
		}else {
			pen = new ThickPen();
			pen.setColor(color);
			pensMap.put(key, pen);
		}
		
		return pen;
	}
	
	
	public static Pen getThinPen(String color) {
		String key = color+" - Thin";
		Pen pen = pensMap.get(key);
		if(pen!=null) {
			return pen;
		}else {
			pen = new ThinPen();
			pen.setColor(color);
			pensMap.put(key, pen);
		}
		
		return pen;
	}
	
	public static Pen getMediumPen(String color) {
		String key = color+" - Mediumss";
		Pen pen = pensMap.get(key);
		if(pen!=null) {
			return pen;
		}else {
			pen = new MediumPen();
			pen.setColor(color);
			pensMap.put(key, pen);
		}
		
		return pen;
	}
}
