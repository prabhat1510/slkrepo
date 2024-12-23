package com.training.demo.model;

public class Customer {

	private Integer custId;
	private String customerName;

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + "]";
	}

}
