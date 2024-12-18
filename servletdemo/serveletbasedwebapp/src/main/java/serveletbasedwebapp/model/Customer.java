package serveletbasedwebapp.model;

public class Customer {
	private Integer custId;
	private String custName;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}

}
