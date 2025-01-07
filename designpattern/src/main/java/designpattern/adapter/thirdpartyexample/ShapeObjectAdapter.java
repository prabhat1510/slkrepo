package designpattern.adapter.thirdpartyexample;

import designpattern.adapter.thirdpartyexamplethirdparty.GShape;
import designpattern.adapter.thirdpartyexamplethirdparty.Rhombus;
import designpattern.adapter.thirdpartyexamplethirdparty.Traingle;

//Object Adapter Pattern
public class ShapeObjectAdapter implements Shape {

	private GShape adaptee;
	
	public ShapeObjectAdapter(GShape adaptee) {
		this.adaptee=adaptee;
	}
	@Override
	public void draw() {
		adaptee.drawShape();
	}

	@Override
	public void resize() {
		System.out.println(description()+" can't be resized. Please create new one with required values. ");
	}

	@Override
	public String description() {
		if(adaptee instanceof Traingle) {
			return "Traingle object";
		}else if(adaptee instanceof Rhombus) {
			return "Rhombus object";
		}else {
			return "Unknown Object";
		}
	}

	@Override
	public boolean isHide() {
		
		return false;
	}

}
