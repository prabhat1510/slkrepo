package designpattern.observer;
public class ObserverDemo {

	public static void main(String[] args) {
		 Subject subject = new Subject();
		 
		 new BinaryObserver(subject);
		 new HexaObserver(subject);
		 System.out.println("First state change: 15");
		 subject.setState(15);
		 System.out.println("Second state change: 10");
		 subject.setState(10);
	}

}
