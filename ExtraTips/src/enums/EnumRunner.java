package enums;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Arrays;

public class EnumRunner {

    public static void main(String[] args) {
	// There are several methods for enums:
	System.out.println(Arrays.toString(Season.values()));
	Season season1 = Season.FALL;
	System.out.println(season1);
	Season season2 = Season.valueOf("WINTER");
	System.out.println(season2);
	System.out.println(season1.name() + " ordinal: " + season1.ordinal());
	System.out.println(season1.name() + " value: " + season1.getValue());
	System.out.println(Season.SPRING.name() + " ordinal: " + Season.SPRING.ordinal());
	System.out.println(Season.SPRING.name() + " value: " + Season.SPRING.getValue());

	// There are inbuild enums like:
	for (DayOfWeek day : DayOfWeek.values()) {
	    System.out.printf("%s value: %d ", day, day.getValue());
	}
	System.out.println();
	// or like:
	for (int i = 1; i <= 12; i++) {
	    System.out.printf("%d month is: %s ", i, Month.of(i));
	}

    }

}
