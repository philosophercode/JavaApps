//This program calculates how many days away two birthdays are and which one is closer.
import java.util.*;
public class BirthdayCounter {
	public static void main(String[] args) {
//The user is prompted to enter today's date and two birthdays.
    	Scanner console = new Scanner (System.in);
    	System.out.println("The current month (1-12): ");
    	int tomonth = console.nextInt();
    	System.out.println("The current day (1-31): ");
    	int today = console.nextInt();
    	System.out.println("First Birthday");
    	System.out.println("Month (1-12): ");
    	int month1 = console.nextInt();
    	System.out.println("Day (1-31): ");
    	int day1 = console.nextInt();
    	System.out.println("Second Birthday");
    	System.out.println("Month (1-12): ");
    	int month2 = console.nextInt();
    	System.out.println("Day (1-31): ");
    	int day2 = console.nextInt();
    	int datetoday = bdayCalc(tomonth, today);
    	int date1 = bdayCalc(month1, day1);
    	int date2 = bdayCalc(month2, day2);
//The following if statement adds a year if the birthday already has passed this year.
        if ((date1-datetoday)<0) {
            date1+=365;
        }
        if ((date2-datetoday)<0) {
            date2+=365;
        }
        int closerdate = closerDate(datetoday, date1, date2);
//Prints out the amount of days away the birthday is and which one is closer.
    	System.out.println("Birthday 1 is "+(date1-datetoday)+" days away.");
    	System.out.println("Birthday 2 is "+(date2-datetoday)+" days away.");
    	System.out.println("Birthday "+closerdate+" is closer.");
    }
    public static int bdayCalc(int month, int day){
//This method converts the month into how days it is into the year.
    	int date=0;
    	if (month==1) {
    		date = day;
        }
        if (month==2) {
            date = (day+31);
        }
        if (month==3) {
            date = (day+31+28);
        }
        if (month==4) {
            date = (day+31+28+31);
        }
        if (month==5) {
            date = (day+31+28+31+30);
        }
        if (month==6) {
            date = (day+31+28+31+30+31);
        }
        if (month==7) {
            date = (day+31+28+31+30+31+30);
        }
        if (month==8) {
            date = (day+31+28+31+30+31+30+31);
        }
        if (month==9) {
            date = (day+31+28+31+30+31+30+31+31);
        }
        if (month==10) {
            date = (day+31+28+31+30+31+30+31+31+30);
        }
        if (month==11) {
            date = (day+31+28+31+30+31+30+31+31+30+31);
        }
        if (month==12) {
            date = (day+31+28+31+30+31+30+31+31+30+31+30);
        }
    	return date;
    }
    public static int closerDate(int datetoday, int date1, int date2){
//This calculates the closer birthday relative to the date today.
        int closerdate = 0;
    	if (date1-datetoday<=date2-datetoday) {
    		closerdate = 1;
    	}
    	else {
    		closerdate = 2;
    	}
    	return closerdate;
    }
}
