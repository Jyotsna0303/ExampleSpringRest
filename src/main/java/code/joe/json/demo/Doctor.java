package code.joe.json.demo;

public class Doctor {
private int id;
private String firstName;
private String lastName;
private boolean active;
private Address address;

private String[] interests;

public Doctor() {
	
}


public String[] getInterests() {
	return interests;
}


public void setInterests(String[] interests) {
	this.interests = interests;
}


public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public boolean isActive() {
	return active;
}


public void setActive(boolean active) {
	this.active = active;
}

}
