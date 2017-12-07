import java.util.Scanner;

public class Nim{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int a,b,c;
		int num;
		String lc="",name;
		a=b=c=3;
		int count=0;

		System.out.print("Player 1, enter your name: ");
		String name1=in.next();
		System.out.print("Player 2, enter your name: ");
		String name2=in.next();
		System.out.println("\nA: 3\tB: 3\tC: 3 ");

		while(a>0 || b>0 ||b>0 ){
			if(count%2==0) name=name1;
			else name=name2;
			System.out.print(name+", Choose a pile: ");
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
			count++;
		}
		if(count%2==0) System.out.println(name1+", there are no counters left, so you win");
		System.out.println(name2+", there are no counters left, so you win");
		
	}
}