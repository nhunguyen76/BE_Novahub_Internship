import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);

		Random r= new Random();
		int num1=r.nextInt(3)+1;
		System.out.println("Which one is the ace\n");
		System.out.println("\t\t##  ##  ##");
		System.out.println("\t\t##  ##  ##");
		System.out.println("\t\t1   2   3 ");
		System.out.print("> ");
		int num2=in.nextInt();
		if(num1==num2){
			System.out.println("you win! The ace was card number "+num1);
		}
		else System.out.println("you wrong! The ace was card number "+num1);

		if(num1==1){
			System.out.println("\t\tAA  ##  ##");
			System.out.println("\t\tAA  ##  ##");
			System.out.println("\t\t1   2   3 ");
		}
		if(num1==2){
			System.out.println("\t\t##  AA  ##");
			System.out.println("\t\t##  AA  ##");
			System.out.println("\t\t1   2   3 ");
		}
		if(num1==3){
			System.out.println("\t\t##  ##  AA");
			System.out.println("\t\t##  ##  AA");
			System.out.println("\t\t1   2   3 ");
		}
	}
}