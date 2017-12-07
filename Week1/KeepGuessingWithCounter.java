import java.util.Scanner;
import java.util.Random;

public class KeepGuessingWithCounter
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner(System.in);
		Random r=new Random();
		int num1=r.nextInt(10)+1;
		int count=1;

		System.out.println("I have choose a number between 1 and 10. Try to guess it.");
		System.out.print("Your guess: ");
		int num2 = in.nextInt();

		while ( num1 != num2 )
		{	count++;
			System.out.println("\nINCORRECT . GUESS AGAIN.");
			System.out.print("Your guess: ");
			num2 = in.nextInt();

		}

		System.out.println("\nThat's right! You are a good guesser.");
		System.out.println("It only took you "+count+" tries.");
	}
}