import java.util.Scanner;
import java.util.Random;

public class DiceDoubles{
	public static void main(String[] args){
		Random r=new Random();

		int num1,num2;


		do{
			num1=r.nextInt(6)+1;
			num2=r.nextInt(6)+1;
			System.out.println("Roll #1: "+num1);
			System.out.println("Roll #2: "+num2);
			System.out.println("The total: "+(num1+num2));
		}while(num1!=num2);
		
	}
}