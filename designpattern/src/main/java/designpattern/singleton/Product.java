package designpattern.singleton;


public class Product {

	private Integer id;
	private String name;
	//Step 2 create static variable of type Product
	private static Product prodSingleInstance = null;
	//Step 1 make constructor private
	private Product() {
		// TODO Auto-generated constructor stub
	}
	
	//Step 3 create a static method to return the static variable referring to Product class object
	public static Product getProdInstance() {
		
		if(prodSingleInstance != null) {//once object is created return the same instance
			return prodSingleInstance;
		}else {
			prodSingleInstance=new Product();//Creating object
			return prodSingleInstance;
		}
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
