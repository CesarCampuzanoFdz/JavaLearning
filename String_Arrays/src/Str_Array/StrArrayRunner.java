package Str_Array;

public class StrArrayRunner {

    public static void main(String[] args) {
	String weekDays[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

	longestArray(weekDays);
	reversePrintArray(weekDays);
    }

    private static void reversePrintArray(String[] array) {

	for (int i = array.length - 1; i >= 0; i--) {
	    reversePrint(array[i]);
	}

    }

    private static void reversePrint(String word) {

	for (int i = word.length() - 1; i > -1; i--) {
	    System.out.printf("%c", word.charAt(i));
	}
	System.out.printf("\n");
    }

    private static void longestArray(String array[]) {
	String longestWord = "";

	for (String word : array) {
	    if (word.length() > longestWord.length()) {
		longestWord = word;
	    }
	}

	System.out.printf("Longest Day is: %s\n", longestWord);

    }

}
