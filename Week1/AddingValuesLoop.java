import java.util.Scanner;

public class AddingValuesLoop{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("I will add up the numbers you give me.");
		System.out.print("Number: ");
		int num=in.nextInt();
		int sum=0;

		while(num!=0){
			sum+=num;
			System.out.println("The total so far is "+sum);
			System.out.print("Number: ");
			num=in.nextInt();
		}

		System.out.print("\nThe total is "+sum);

	}
}