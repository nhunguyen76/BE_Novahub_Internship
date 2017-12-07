package Bai3_4;


public class MyTime {
	private int hour;
	private int minute;
	private int second;
	
	public MyTime(int hour, int minute, int second) {		
			this.hour = hour;
			this.minute = minute;
			this.second = second;
	}
	
	public void setTime(int hour, int minute, int second){
		if(hour<0 || hour>23 || minute<0 || minute>59 || second<0 || second >59) 
				throw new IllegalArgumentException("Invalid hour, minute, or second!");
		else {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setHour(int hour) {
		if(hour<0 || hour>23) 
			throw new IllegalArgumentException("Invalid hour !");
		else
			this.hour=hour;
	}
	public void setMinute(int minute) {
		if(minute<0 || minute>59) 
			throw new IllegalArgumentException("Invalid minute !");
		else
			this.minute=minute;
	}
	public void setSecond(int second) {
		if(second <0 || second>23) 
			throw new IllegalArgumentException("Invalid second!");
		else
			this.second=second;
	}
	
	public String toString() {
		String h=""+hour;
		String m=""+minute;
		String s=""+second;
		if(hour<10) h="0"+hour;
		if(minute<10) m="0"+minute;
		if(second<10) s="0"+second;
		return h+":"+m+":"+s;
		
	}
	
	public MyTime nextSecond() {
		second+=1;
		if(second>59) {
			second=0;
			minute+=1;
			if(minute>59) {
				minute=0;
				hour+=1;
				if(hour>23) hour=0;
			}
		}
		return this;
	}
	
	public MyTime nextMinute() {
		minute+=1;
		if(minute==60 ) {
			hour++;
			minute=0;
			if(hour==24) hour=0;
		}
		return this;
	}
	
	public MyTime nextHour() {
		hour+=1;
		if(hour==24 ) {
			hour=0;
			}
		return this;
	}
	
	public MyTime previousSecond() {
		second=second-1;
		if(second<0) {
			second=59;
			minute=minute-1;
			if(minute<0) {
				minute=59;
				hour=hour-1;
				if(hour<0) hour=23;
			}
		} 
		return this;
	}
	
	public MyTime previousMinute() {
		minute--;
		if(minute<0) {
			hour--;
			minute=59;
			if(hour<0) hour=23;
		} 
		return this;
	}
	
	public MyTime previousHour() {
		hour--;
		if(hour<0) {
			hour=23;
		} 
		return this;
	}
}
