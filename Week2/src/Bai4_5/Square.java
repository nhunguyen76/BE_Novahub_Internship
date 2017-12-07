package Bai4_5;

public class Square extends Rectangle {
	public Square(){
		super();
	}
	
	public Square(double side) {
		super(side,side);
	}
	
	public Square(double side, String color,boolean filled) {
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return getLength();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public void setLength(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	@Override
	public String toString() {
		return "A Square with side="+ this.getLength() +", which is a subclass of "+ super.toString();
	}
}
