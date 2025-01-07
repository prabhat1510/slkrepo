package designpattern.flyweight;

public class ThickPen implements Pen {
	final BrushSize brushSize= BrushSize.THICK;
	private String color = null;

	@Override
	public void setColor(String color) {
		this.color=color;

	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing THICK content in color :" +color);

	}

}
