package designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	
	private List<String>  empList;

	public Employees() {
		empList= new ArrayList<String>();
	}

	public Employees(List<String> empList) {
		this.empList = empList;
	}
	
	
	public void loadData() {
		empList.add("Raj");
		empList.add("Raju");
		empList.add("Raji");
		empList.add("Rajnish");
	}
	
	public List<String> getEmpList(){
		return empList;
	}	
	
	/**
	 * clone method is overridden to provide a deep copy of the employees list.
	 */
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String>  temp = new ArrayList<String>();
		for(String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}
	
}
