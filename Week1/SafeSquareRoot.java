import java.util.Scanner;

public class SafeSquareRoot{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("SQUARE ROOT!");
		System.out.print("Enter a number: ");
		int num=in.nextInt();

		while(num<0){
			System.out.println("\nYou can't take the square root of a negative number, silly.");
			System.out.print("Try again: ");
			num=in.nextInt();
		}

		System.out.println("The square root of "+num+" is "+Math.sqrt(num));

	}
}