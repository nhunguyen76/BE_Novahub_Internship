import java.util.Scanner;
import java.util.Random;

public class AgainKeepGuessing
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner(System.in);
		Random r=new Random();
		int num1=r.nextInt(10)+1;
		int num2=0;
		int count=0;

		System.out.println("I have choose a number between 1 and 10. Try to guess it.");
		do{
			if(count>0) System.out.print("That is incorrect. Guess again");
			count++;

		    System.out.print("\nYour guess: ");
			num2 = in.nextInt();

		}while( num1 != num2 );

		System.out.println("\nThat's right! You are a good guesser.");
		System.out.println("It only took you "+count+" tries");
	}
}