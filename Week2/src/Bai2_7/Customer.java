package Bai2_7;

public class Customer {
	int ID,discount;
	String name;

	public Customer(int ID, String name, int discount) {
		this.ID = ID;
		this.name = name;
		this.discount = discount;
	}	

	public int getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	} 
	
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String toString() {
		return name + "(" + ID + ")";
	}
	
}
