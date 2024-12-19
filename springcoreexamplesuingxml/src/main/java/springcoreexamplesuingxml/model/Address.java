package springcoreexamplesuingxml.model;

public class Address {
	private Integer addressId;
	private String city;
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + "]";
	}
	
	

}
