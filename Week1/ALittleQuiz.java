import java.util.Scanner;

public class ALittleQuiz{
	public static void main(String[] args){

	Scanner input=new Scanner(System.in);

	int count,lc;
	count=0;

	System.out.println("Are you ready for a quiz?");
	System.out.println("Okay, here it comes!");

	System.out.println("Q1) What is the capital of Alaska?");
	System.out.println("\t1) Melbourne");
	System.out.println("\t2) Anchorage");
	System.out.println("\t3) Juneau");

	System.out.print(">");
	lc=input.nextInt();

	if(lc==3) {
		System.out.println("That's right");
		count++;
	}
	else System.out.println("That's wrong");

	System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
	System.out.println("\t1) yes");
	System.out.println("\t2) no");
	System.out.print(">");
	lc=input.nextInt();

	if(lc==2) {
		System.out.println("That's right");
		count++;
	}
	else System.out.println("Sorry, \"cat\" is a string. ints can only store numbers");

	System.out.println("Q3) What is the result of 9+6/3");
	System.out.println("\t1) 5");
	System.out.println("\t2) 11");
	System.out.println("\t3) 15/3");
	System.out.print(">");
	lc=input.nextInt(); 

	if(lc==2) {
		System.out.println("That's right");
		count++;
	}
	else System.out.println("That's wrong");

	System.out.println("Overall, you got "+count+" out of 3 correct");
	System.out.println("Thanks for playing");
	}
}