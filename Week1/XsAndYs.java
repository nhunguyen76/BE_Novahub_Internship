

public class XsAndYs{

    public static void main( String[] args )
    {
        System.out.println( "x\ty" );
    	System.out.println( "--------------" );

        for ( float i = -10 ; i <= 10 ; i=i+0.5f )
        {
            System.out.println( i+"\t"+(i*i) );
        }

    }
}