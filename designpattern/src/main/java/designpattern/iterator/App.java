package designpattern.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Iterator itr =listOfNumbers.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
