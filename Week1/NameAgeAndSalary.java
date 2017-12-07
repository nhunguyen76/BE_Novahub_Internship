import java.util.Scanner;

public class NameAgeAndSalary{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		String name;
		int age,sal;

		System.out.println("Hello, What is your name");
		name=input.next();

		System.out.println("Hi, "+name+"! How old are you?");
		age=input.nextInt();

		System.out.println("So you're "+age+", eh? That's not old at all");
		System.out.println("How much do you make, "+name+"?");
		sal=input.nextInt();

		System.out.println(sal+"! I hope that's per hour and not per year! LOL!");
	}
}