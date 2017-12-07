package Bai1_8;

public class Time {
	int hour,minute,second;

	public Time(int h,int m,int s) {
		hour=h;
		minute=m;
		second=s;
	}
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int h,int m,int s) {
		this.hour=h;
		this.minute=m;
		this.second=s;
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
	
	public Time nextSecond() {
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
	
	public Time previousSecond() {
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
}
