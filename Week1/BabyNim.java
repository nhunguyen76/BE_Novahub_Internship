import java.util.Scanner;

public class BabyNim{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int a,b,c;
		int num;
		String lc="";
		a=b=c=3;
		System.out.println("A: 3\tB: 3\tC: 3 ");

		while(a>0 || b>0 ||b>0 ){
			System.out.print("Choose a pile");
			lc=in.next();
			System.out.print("How many to remove from pile "+lc+": ");
			num=in.nextInt();
			if(lc.equals("A")){
				a=a-num;
			}
			else if(lc.equals("B")){
				b=b-num;
			}
			else if(lc.equals("C")){
				c=c-num;
			}

			System.out.println("A: "+a+"\tB: "+b+"\tC: "+c);

		}
		System.out.println("All piles are empty. Good job!");
	}
}