import java.util.Scanner;

public class BMICalculator{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		float height,weight;

		System.out.print("Your height in m : ");
		height=input.nextFloat();

		System.out.print("Your weight in kg : ");
		weight=input.nextFloat();

		System.out.println("Your BMI is "+weight/(height*height));

		System.out.println("----------------");
		System.out.print("Your height in inches : ");
		height=input.nextFloat();
		height*=0.0254f;

		System.out.print("Your weight in pounds : ");
		weight=input.nextFloat();
		weight*=0.453592f;

		System.out.println("Your BMI is "+weight/(height*height));

		System.out.println("----------------");

		System.out.print("Your height (feet only) : ");
		float feet=input.nextFloat();
		feet*=0.3048f;

		System.out.print("Your height (inches) : ");
		height=input.nextFloat();
		height*=0.0254f;
		height+=feet;

		System.out.print("Your weight in pounds : ");
		weight=input.nextFloat();
		weight*=0.453592;

		System.out.println("Your BMI is "+weight/(height*height));
	}
}