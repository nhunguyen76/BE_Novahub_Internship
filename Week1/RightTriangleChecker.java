import java.util.Scanner;

public class RightTriangleChecker{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num1,num2,num3;

		System.out.println("Enter three integers: ");
		System.out.print("Side 1: ");
		num1=in.nextInt();

		System.out.print("Side 2: ");
		num2=in.nextInt();

		while(num2<num1){
			System.out.println(num2+" is smaller than "+num1+" . Try again.");
			System.out.print("Try again: ");
			num2=in.nextInt();
		}

		System.out.print("Side 3: ");
		num3=in.nextInt();

		while(num3<num2){
			System.out.println(num3+" is smaller than "+num2+" . Try again.");
			System.out.print("Try again: ");
			num3=in.nextInt();
		}

		System.out.println("Your three sides are "+num1+" "+num2+" "+num3);

		if((num1*num1)+(num2*num2)==(num3*num3))
			System.out.println("The sides do make a right triangle.");
		else System.out.println("No! These sides do not make a right triagle!");

	}
}