package Bai1_4;

public class Employee {
	int id,salary;
	String firstName,lastName;
	
	public Employee(int a,String b,String c,int d) {
		this.id=a;
		this.firstName=b;
		this.lastName=c;
		this.salary=d;		
	}
	public int getId() {
		return id;
	}
	/*public void setId(int id) {
		this.id = id;
	}*/
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	/*public void setFirstName(String firstName) {
		this.firstName = firstName;
	}*/
	public String getLastName() {
		return lastName;
	}
	/*public void setLastName(String lastName) {
		this.lastName = lastName;
	}*/
	
	public String getName() {
		return this.firstName+" "+this.lastName;
	}
	
	public int getAnnualSalary() {
		return this.salary*12;
	}
	
	public int raiseSalary(int percent) {
		return (this.salary*percent/100)+this.salary;
	}
	
	public String toString() {
		return "Employee[id="+this.id+",name="+this.firstName+" "+this.lastName+",salary="+this.salary+"]";
	}
}
