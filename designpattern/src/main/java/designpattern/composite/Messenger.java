package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Messenger {
	
	LetterComposite messageFromOrcs() {
		
		List<Word> words = new ArrayList<Word>();
		words.add(new Word('W','h','e','r','e'));
		words.add(new Word('t','h','e','r','e'));
		words.add(new Word('i','s'));
		words.add(new Word('a'));
		words.add(new Word('w','h','i','p'));
		words.add(new Word('t','h','e','r','e'));
		words.add(new Word('i','s'));
		words.add(new Word('a'));
		words.add(new Word('w','a','y'));
	
	return new Sentence(words);
	}
	
LetterComposite messageFromElves() {
		
		List<Word> words = new ArrayList<Word>();
		words.add(new Word('M','u','c','h'));
		words.add(new Word('w','i','n','d'));
		words.add(new Word('p','o','u','r','s'));
		words.add(new Word('f','r','o','m'));
		words.add(new Word('y','o','u','r'));
		words.add(new Word('m','o','u','t','h'));
		
	
	return new Sentence(words);
	}

}
