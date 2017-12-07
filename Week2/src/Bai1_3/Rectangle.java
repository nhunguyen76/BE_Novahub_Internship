package Bai1_3;

public class Rectangle {
	float length;
	float width;
	
	public Rectangle() {
		length=1.0f;
		width=1.0f;
	}
	
	public Rectangle(float l, float w) {
		this.length=l;
		this.width=w;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	
	public double getArea() {
		return length*width;
	}
	
	public double getPerimeter() {
		return (length+width)*2;
	}
	
	public String toString() {
		return "Rectangle[length="+this.length+",width="+this.width+"]";
	}
	
	
}
