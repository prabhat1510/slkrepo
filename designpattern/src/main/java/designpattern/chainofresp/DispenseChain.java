package designpattern.chainofresp;

//It have a method to define the next processor in the chain and the method will process the request
public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	void dispense(Currency cur);
}
