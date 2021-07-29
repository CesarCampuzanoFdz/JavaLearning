package api.f;

/*
 * Since Java 14, there is a Switch expression, similar to the Swith statement but: 
 * - It does not have fall through (it does not execute other lines without break) 
 * - the switch returns a variable, so the cases need a yield or simply an assigment with ->
 */
public class SwitchExpressionRunner {

    public static String findDatOfTheWeek(int day) {
	String dayOfWeek = "";
	switch (day) {
	case 0:
	    dayOfWeek = "Monday";
	    break;
	case 1:
	    dayOfWeek = "Tuesday";
	    break;
	case 2:
	    dayOfWeek = "Wednesday";
	    break;
	case 3:
	    dayOfWeek = "Thursday";
	    break;
	case 4:
	    dayOfWeek = "Friday";
	    break;
	case 5:
	    dayOfWeek = "Satuday";
	    break;
	case 6:
	    dayOfWeek = "Sunday";
	    break;
	default:
	    throw new IllegalArgumentException("No valid Weekday" + day);
	}
	return dayOfWeek;
    }

    public static String findDatOfTheWeekWithSwitchExpression(int day) {
	String dayOfWeek = switch (day) {
	case 0 -> "Monday";
	case 1 -> "Tuesday";
	case 2 -> {
	    // using braces you can put more code, ending with a yield:
	    System.out.println("Some other code");
	    yield "Wednesday";
	}
	case 3 -> "Thursday";
	case 4 -> "Friday";
	case 5 -> "Satuday";
	case 6 -> "Sunday";
	default -> throw new IllegalArgumentException("No valid Weekday" + day);
	};
	return dayOfWeek;
    }

    public static void main(String[] args) {

	System.out.println(findDatOfTheWeek(2));
	System.out.println(findDatOfTheWeekWithSwitchExpression(2));
    }

}
