package designpattern.chainingofcons;

//Constructor chaining
public class Employee {
	private Integer id;
	private String name;

	public Employee() {
		// this(15,"Nithin");
	}

	public Employee(Integer id) {
		this();
		this.id = id;
	}

	public Employee(String name) {
		this(15);
		this.name = name;
	}

	public Employee(Integer id, String name) {
		this("Mahi");
		this.id = id;
		this.name = name;
	}

}
