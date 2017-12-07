import java.util.Scanner;

public class SpaceBoxing{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		float val=0.0f;
		System.out.print("Please enter your current earth weight: ");
		int weight=input.nextInt();

		System.out.println("\nI have information for the following planets:");
		System.out.println("\t1. Venus   2. Mars    3.Jupiter  ");
		System.out.println("\t4. Saturn  5. Uranus  6.Neptune  ");
		System.out.println("Which planet are you visiting? ");
		int lc=input.nextInt();

		if(lc==1){
			val=weight*0.78f;
		}
		else if(lc==2){
			val=weight*0.39f;
		}
		else if(lc==3){
			val=weight*2.65f;
		}
		else if(lc==4) {
			val=weight*1.17f;

		}
		else if(lc==5) {
			val=weight*1.05f;

		}
		else if(lc==6) {
			val=weight*1.23f;

		}
		System.out.println("Your weight would be "+val+" pounds on that planet");
	}
}