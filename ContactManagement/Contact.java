package ContactManagement;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Contact {
	String name;
	String organisation;
	List<String> phoneNumber;
	List<String> address;
	
	public void addPhoneNumber(String PhoneNumber, String label) {
		PhoneNumber ph = new PhoneNumber();
		ph.setPhoneNumber(PhoneNumber);
		ph.setLabel(label);
	}
	
	public void addAddress(String address, String label) {
		Address adress = new Address();
		adress.setAddress(address);
		adress.setLabel(label);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
}
