import java.util.Scanner;

public class ADumbCalculator{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		float num1,num2,num3;

		System.out.print("What is your first number? ");
		num1=input.nextFloat();

		System.out.print("What is your second number? ");
		num2=input.nextFloat();

		System.out.print("What is your third number? ");
		num3=input.nextFloat();

		System.out.println("( "+ num1 +" + "+ num2 +" + "+num3+" ) / 2 is ... "+((num1+num2+num3)/2) );

	}
}