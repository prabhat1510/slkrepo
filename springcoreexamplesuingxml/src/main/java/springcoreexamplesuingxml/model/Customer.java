package springcoreexamplesuingxml.model;

public class Customer {
	private Integer custId;
	private String name;
	//Customer class object is dependent on address object
	private Address address;
	private Address personalAddress;
	private Address professionalAddress;
	private Address otherAddress;

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getPersonalAddress() {
		return personalAddress;
	}

	public void setPersonalAddress(Address personalAddress) {
		this.personalAddress = personalAddress;
	}

	public Address getProfessionalAddress() {
		return professionalAddress;
	}

	public void setProfessionalAddress(Address professionalAddress) {
		this.professionalAddress = professionalAddress;
	}

	public Address getOtherAddress() {
		return otherAddress;
	}

	public void setOtherAddress(Address otherAddress) {
		this.otherAddress = otherAddress;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", address=" + address + ", personalAddress="
				+ personalAddress + ", professionalAddress=" + professionalAddress + ", otherAddress=" + otherAddress
				+ "]";
	}




}
