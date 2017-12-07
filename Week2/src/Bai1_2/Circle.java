package Bai1_2;

	public class Circle {  

		   private double radius;
		   
		   // The default constructor with no argument.
		   // It sets the radius and color to their default value.
		   public Circle() {
		      radius = 1.0;
		   }
		   
		   // 2nd constructor with given radius, but color default
		   public Circle(double r) {
		      radius = r;
		   }
		   
		   // A public method for retrieving the radius
		   public double getRadius() {
		     return radius; 
		   }
		   
		   public void setRadius(double r) {
			   radius=r;
		   }
		   
		   // A public method for computing the area of circle
		   public double getArea() {
		      return radius*radius*Math.PI;
		   }

		  public double getCircumference() {
			  return Math.PI;
		  } 
		  
		  public String toString() {
			  return "Circle[radius="+radius+"]";
		  }

		}

