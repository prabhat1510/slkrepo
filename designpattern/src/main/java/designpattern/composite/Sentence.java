package designpattern.composite;

import java.util.List;

public class Sentence extends LetterComposite{

	
	
	public Sentence(List<Word> words) {
		words.forEach(this::add);
	}
	
	public void printThisBefore() {
		System.out.println(".");
	}
}
