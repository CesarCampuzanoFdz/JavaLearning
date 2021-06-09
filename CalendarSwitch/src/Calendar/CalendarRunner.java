package Calendar;

import java.util.Scanner;

public class CalendarRunner {

    public static void main(String[] args) {

	Scanner consola = new Scanner(System.in);
	System.out.printf("Type a day of the week (1-7):");
	int dayOfTheWeek = consola.nextInt();
	System.out.printf("%d is %s\n", dayOfTheWeek, whichDay(dayOfTheWeek));
	System.out.printf("%d is week day?\n\t%s\n", dayOfTheWeek, isWeekDay(dayOfTheWeek));
	consola.close();
    }

    private static String whichDay(int day) {
	String sDayOfTheWeek = "";

	switch (--day) {
	case 0: {
	    sDayOfTheWeek = "Monday";
	    break;
	}
	case 1: {
	    sDayOfTheWeek = "Tuesday";
	    break;
	}
	case 2: {
	    sDayOfTheWeek = "Wednesday";
	    break;
	}
	case 3: {
	    sDayOfTheWeek = "Thursday";
	    break;
	}
	case 4: {
	    sDayOfTheWeek = "Friday";
	    break;
	}
	case 5: {
	    sDayOfTheWeek = "Saturday";
	    break;
	}
	case 6: {
	    sDayOfTheWeek = "Sunday";
	    break;
	}
	default: {
	    sDayOfTheWeek = "ERROR";
	    break;
	}
	}

	return sDayOfTheWeek;
    }

    private static boolean isWeekDay(int day) {
	boolean weekDay;

	switch (--day) {
	case 0:
	case 1:
	case 2:
	case 3:
	case 4: {
	    weekDay = true;
	    break;
	}
	case 5:
	case 6:
	default: {
	    weekDay = false;
	    break;
	}
	}

	return weekDay;
    }
}
