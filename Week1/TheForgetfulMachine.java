import java.util.Scanner;

public class TheForgetfulMachine{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		String var1,var2;
		int num1,num2;

		System.out.println("Give me a word");
		var1=input.next();

		System.out.println("Give me a second word");
		var2=input.next();

		System.out.println("Great, now your favorite number");
		num1=input.nextInt();

		System.out.println("And your second-favorite number...");
		num1=input.nextInt();

		System.out.println("Whew! Wasn't that fun?");
	}
}