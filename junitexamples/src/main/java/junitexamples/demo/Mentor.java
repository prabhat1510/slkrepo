package junitexamples.demo;

public class Mentor {
	private String fName;
	private String lName;

	public Mentor(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	
	public String getFullName() {
		return this.fName+" "+this.lName;
	}
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Mentor [fName=" + fName + ", lName=" + lName + "]";
	}

}
