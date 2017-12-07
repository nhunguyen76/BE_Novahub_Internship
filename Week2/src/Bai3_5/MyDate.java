package Bai3_5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
	private int year;
	private int month;
	private int day;
	private String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public boolean isLeapYear(int year) {
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
			return true;
		}
		else return false;
	}
	
	public boolean isValidDate(int year,int month,int day) {
		if(year<1 || year >9999) return false;
		else {
			if(month<1 || month >12) return false;
			else {
				if(month==2 && isLeapYear(year)) {
					if(day>=1 && day<=29) return true;
					else return false;
				}
				else {
					if(day>=1 && day<=daysInMonths[month-1]) return true;
					else return false;
				}
			}
		}	
	}
	
	public int getDayOfWeek(int year, int month, int day) {
		Calendar cal = new GregorianCalendar(year, month - 1, day);
		int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
		return dayNumber-1;
	}
	
	public MyDate(int year, int month, int day) {
		setDate(year, month, day);
	}

	public void setDate(int year, int month, int day) {
		if(isValidDate(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		}
		else throw new IllegalArgumentException("Invalid year, month or day!");			
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setYear(int year) {
		if(year>=1 && year <=9999) this.year =year;
		else throw new IllegalArgumentException("Invalid year!");			
	}
	
	public void setMonth(int month) {
		if(year>=1 && year <=12) this.month =month;
		else throw new IllegalArgumentException("Invalid month!");			
	}
	public void setDay(int day) {
		if(isLeapYear(year) && month == 2 ) {
			if(day>=1 && day <=29) this.day=day;
			else throw new IllegalArgumentException("Invalid day!");		
		}
		else if(day>=1 && day<=daysInMonths[month-1]) this.day=day;
			else throw new IllegalArgumentException("Invalid day!");			
	}
	
	public String toString() {
		String s = "";
		s += strDays[getDayOfWeek(year, month, day)] + " ";
		s += day + " ";
		s += strMonths[month-1] + " ";
		s += year;
		return s;
	}
	
	public MyDate nextDay() {
		day++;
		if(day>daysInMonths[month-1] || (isLeapYear(year) && day>29)) {
			month++;
			day=1;
			if(month>12) {
				month=1;
				year++;
			} 
		}
		return this;
	}
	
	public MyDate nextMonth() {
		if(month==1 && isLeapYear(year)) day=29;
		if(day==31) day=daysInMonths[month];
		month++;
		if(month>12) {
			month=1;
			year++;
		}
		return this;
	}
	
	public MyDate nextYear() {
		if(isLeapYear(year) && month==2) {
			day=28;
		}
		year++;
		return this;
	}
	
	public MyDate previousDay() {
		day--;
		if(day<1) {
			month--;
			day=daysInMonths[month-1];
			if(month<1) {
				month=12;
				year--;
			} 
		}
		return this;
	}
	
	public MyDate previousMonth() {
		if(day==31) {
			day=daysInMonths[month-2];
		}
		month--;
		if(month<1) {
			month=12;
			year--;
		}
		return this;
	} 
	
	public MyDate previousYear() {
		if(isLeapYear(year) && month==2) {
			day=28;
		}
		year--;
		return this;
	}
	
}
