import java.util.Scanner;

public class MoreUserInputOfData{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		String firstName,lastName,log;
		int grade,id_student;
		float num;

		System.out.print("First name : ");
		firstName=input.next();

		System.out.print("Last name : ");
		lastName=input.next();

		System.out.print("Grade (9-12) : ");
		grade=input.nextInt();

		System.out.print("Student ID : ");
		id_student=input.nextInt();

		System.out.print("Login : ");
		log=input.next();

		System.out.print("GPA (0.0-4.0) : ");
		num=input.nextFloat();

		System.out.println("Your information:");
		System.out.println("\tLogin: "+log);
		System.out.println("\tID: "+id_student);
		System.out.println("\tName: "+lastName+", "+firstName);
		System.out.println("\tGPA: "+num);
		System.out.println("\tGrade: "+grade);

	}
}