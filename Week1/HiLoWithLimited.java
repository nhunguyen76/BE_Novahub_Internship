import java.util.Scanner;
import java.util.Random;

public class HiLoWithLimited{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		int num1=r.nextInt(100)+1;
		int count=1;
		System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
		System.out.print("First guess: ");
		int num2=in.nextInt(); 
		
		while(num2!=num1 && count<7){
			

			if(num2<num1){
				System.out.println("Sorry, you are too low.");
			}
			if(num2>num1){
				System.out.println("Sorry, you are too high.");
			}
			count++;
			System.out.print("Guess #"+count+": ");
			num2=in.nextInt();
			
		}
		if(count==7 && num2!=num1) System.out.println("Sorry, you didn't guess it in 7 tries. you lose.");
		if(num2==num1) System.out.print("You guessed it");
	}
}