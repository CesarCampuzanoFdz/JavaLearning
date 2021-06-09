package functionalProgramming;

import java.util.List;
import java.util.stream.IntStream;

public class Exercises {

    public static void main(String[] args) {
	printSquares();
	List<String> list1 = List.of("PrUeBa", " ", "dE", " ", "Stri", "NGs");
	lowerCaseStringStream(list1);
	lengthOfStringStream(list1);
    }

    // method to print the square of the 10 first numbers
    // I use map, because it allows to change the value of the element streamed in
    // an itermediate operation
    private static void printSquares() {
	IntStream.rangeClosed(0, 10).map(el -> {
	    return el * el;
	}).forEach(el -> {
	    System.out.println(el);
	});

    }

    private static void lowerCaseStringStream(List<String> list1) {
	list1.stream().map(str -> {
	    return str.toLowerCase();// In this case I change a string into a string but lowercase
	}).forEach(str -> {
	    System.out.printf("%s", str);
	});
	System.out.println();
    }

    private static void lengthOfStringStream(List<String> list1) {

	list1.stream().map(str -> {
	    return str.length();// In this case I change a string into a integer! so the next operation will
				// receive a stream of integers
	}).forEach(len -> {
	    int i = 1;
	    System.out.printf("%d", len);
	    while (i < len) {
		System.out.printf(" ");
		i++;
	    }
	});
	System.out.println();
    }
}
