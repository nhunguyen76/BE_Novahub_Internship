import java.util.Scanner;

public class CollatzSequence{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);

		System.out.print("Starting number: ");
		int n=in.nextInt();
		System.out.print(n+"\t");
		int count=1;

		while(n!=1){
			if(n%2==0) n=n/2;
			else n=3*n+1;

			count++;
			System.out.print(n+"\t");
			if(count==10){
				count=0;
				System.out.print("\n");
			}
		}

	}
}