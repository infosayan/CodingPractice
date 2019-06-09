package test;

import java.util.List;

public class Employee {

	public String Id;
	public String Name;
	public List<Address> address;
	public Employee(String id, String name, List<Address> address) {
		super();
		Id = id;
		Name = name;
		this.address = address;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
}
