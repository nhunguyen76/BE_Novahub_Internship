import java.util.Scanner;

public class AddingValuesWithLoop
{
    public static void main( String[] args )
    {
    	Scanner in = new Scanner(System.in);
    	System.out.print( "Number: " );
    	int n=in.nextInt();
    	int sum=0;
        for ( int j = 1 ; j <= n ; j++ )
        {
            System.out.print( j+" " );
            sum+=j;
        }
        System.out.println( "\nthe total is "+sum );

    }
}