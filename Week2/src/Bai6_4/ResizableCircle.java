package Bai6_4;

public class ResizableCircle extends Circle implements Resizable {
	 
	   // Constructor
	   public ResizableCircle(double radius) {
	      super(radius);
	   }
	 
	   // Implement methods defined in the interface Resizable
	   @Override
	   public double resize(int percent) { 
		   return this.getRadius()*(1-(percent/100.0));
	   }
	}
