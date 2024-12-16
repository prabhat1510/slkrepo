 package jdbcapp.model;

public class Department {
	private Integer deptNo;
	private String deptName;
	public Department() {
		// TODO Auto-generated constructor stub
	}
	public Department(Integer deptNo, String deptName) {
		this.deptNo = deptNo;
		this.deptName = deptName;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}
	
}
