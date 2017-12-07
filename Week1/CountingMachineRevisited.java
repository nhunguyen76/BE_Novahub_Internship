import java.util.Scanner;

public class CountingMachineRevisited
{
    public static void main( String[] args )
    {
    	Scanner in = new Scanner(System.in);
        System.out.print( "Count from: " );
        int from=in.nextInt();
    	System.out.print( "Count to: " );
    	int to=in.nextInt();
        System.out.print( "Count by: " );
        int by=in.nextInt();

        for ( int i = from ; i <= to ; i=i+by )
        {
            System.out.print( i+" " );
        }

    }
}