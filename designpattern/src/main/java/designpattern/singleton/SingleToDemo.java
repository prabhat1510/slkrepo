package designpattern.singleton;

public class SingleToDemo {
	public static void main(String[] args) {
		/**
		Product prod = new Product();
		Product prod1 = new Product();
		System.out.println(prod.hashCode());
		System.out.println(prod1.hashCode());**/
		
		/**
		 * My requirement is that single object of Product class
		 * 1. Make constructor of the class private
		 * 2. Step 2 create static variable of type Product
		 * 3. Step 3 create a static method to return the static variable referring to Product class object
		 */
		
		Product prod = Product.getProdInstance();
		Product prod1 =Product.getProdInstance();
		System.out.println(prod.hashCode());
		System.out.println(prod1.hashCode());
	}	
}
