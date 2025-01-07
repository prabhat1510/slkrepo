package designpattern.composite;

public class App {
	
	/**
	 * Composite design pattern is a partitioning design pattern. 
	 * It describes that a group of objects is to be treated in the same way as a single
	 * instance of an object.
	 * The intent of a composite is to "compose" objects into tree structures to represent 
	 * part-whole hierarchies.
	 * Implementing this pattern lets clients treat individual object as and compositions uniformly.
	 * 
	 * 
	 * Here in this example we have sentences composed of words composed of letters. 
	 * All of these objects can be treated through the same interface - LetterComposite
	 */
	public static void main(String[] args) {
		System.out.println("\nMessage from the elves: ");
		LetterComposite elvesMessage= new Messenger().messageFromElves();
		elvesMessage.print();
		
		System.out.println("\nMessage from the orcs: ");
		LetterComposite orcsMessage= new Messenger().messageFromOrcs();
		orcsMessage.print();
		}

}
