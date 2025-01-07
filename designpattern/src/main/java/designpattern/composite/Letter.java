package designpattern.composite;

public class Letter extends LetterComposite{

	private final char character;
	
	public Letter(char c) {
		this.character=c;
	}
	
	public void printThisBefore() {
		System.out.println(character);
	}
}
