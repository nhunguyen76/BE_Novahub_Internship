package Bai2_8;

public class Customer {
	int ID;
	String name;
	char gender;
	
	public Customer(int id, String name, char gender) {
		this.ID = id;
		this.name = name;
		this.gender = gender;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public String toString() {
		return name + "(" + ID + ")";
}
}
