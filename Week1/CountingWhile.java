import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it several times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		System.out.print( "How many times: " );
		int num=keyboard.nextInt();

		int n = 1;
		while ( n <= num )
		{
			System.out.println( (n*10) + ". " + message );
			n++;
		}

	}
}