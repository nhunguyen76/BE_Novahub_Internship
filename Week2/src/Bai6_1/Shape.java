package Bai6_1;

public abstract class Shape {
	protected String color;
    protected boolean filled;
    
    public Shape() {
    	this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
    	String s = "";
        if(!this.isFilled()) {
        	s = "Not ";
        }
    	return "A Shape with color of " + this.getColor() + " and "+ s +"filled";
    }
	
	public abstract double getArea();
    public abstract double getPerimeter();
    
}
