package designpattern.flyweight;

public class MediumPen implements Pen {
	final BrushSize brushSize= BrushSize.MEDIUM;//intrinsic state - shareable
	private String color = null; //extrinsic attribute which will be supplied by client, else everything will remain same for the Pen

	@Override
	public void setColor(String color) {
		this.color=color;

	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing MEDIUM content in color :" +color);

	}
}
