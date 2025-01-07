package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author UD SYSTEMS
 * 
 * Composite Interface
 *
 */
public abstract class LetterComposite {
	private final List<LetterComposite> children = new ArrayList<>();

	public void add(LetterComposite letter) {
		children.add(letter);
	}

	public int count() {
		return children.size();
	}

	protected void printThisBefore() {

	}

	protected void printThisAfter() {

	}

	/**
	 * Print
	 */

	public void print() {
		printThisBefore();
		children.forEach(LetterComposite::print);
		printThisAfter();
	}
}
