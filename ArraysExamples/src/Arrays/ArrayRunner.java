package Arrays;

import java.util.Arrays;

public class ArrayRunner {

    public static void main(String[] args) {
	int[] marks = new int[8];

	for (int i = 0; i < marks.length; i++) {
	    marks[i] = i + 1;
	}
	Arrays.fill(marks, 10);
	arrayPrint(marks);
	arrayEnhancedPrint(marks);
	System.out.printf("%s", Arrays.toString(marks));
    }

    private static void arrayEnhancedPrint(int[] array) {
	for (int value : array) {
	    System.out.printf("%d ", value);
	}
	System.out.printf("\n");
    }

    public static void arrayPrint(int[] array) {
	for (int i = 0; i < array.length; i++) {
	    System.out.printf("%d ", array[i]);
	}
	System.out.printf("\n");
    }

}
