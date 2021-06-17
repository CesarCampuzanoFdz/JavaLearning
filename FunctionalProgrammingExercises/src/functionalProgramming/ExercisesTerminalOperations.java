package functionalProgramming;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExercisesTerminalOperations {

    public static void main(String[] args) {

	calculateSumOfNFirstNumbers(10);
	List<Integer> list1 = List.of(4, 23, 6, 1, 3, 8);
	System.out.println(maxWithFP(list1));
	System.out.println(minWithFP(list1));
	System.out.println(filterOddFP(list1));
	System.out.println(filterEvenFP(list1));
	System.out.println(squaresFP(list1));
    }

    // reduce with 2 arguments uses the value form the stream and a preset value to
    // return term
    private static void calculateSumOfNFirstNumbers(int n) {
	int sum = IntStream.rangeClosed(0, n).reduce(0, (n1, n2) -> {
	    return n1 + n2;
	});
	System.out.println(sum);
    }

    private static int maxWithFP(List<Integer> list1) {
	Optional<Integer> result = list1.stream().max((n1, n2) -> {// the max() method works with a comparator lambda
	    // expression, so I use the Integer.compare() to compare the integer values
	    return Integer.compare(n1, n2);
	});

	if (result.isPresent()) {
	    return result.get();// MAX returns an object called Optional, that avoids NULL exceptions
	} else {
	    return 0;
	}
    }

    private static int minWithFP(List<Integer> list1) {
	return list1.stream().min((n1, n2) -> {// the min() method works with a comparator lambda
	    // expression,
	    // so I use
	    // the Integer.compare() to compare the integer values
	    return Integer.compare(n1, n2);
	}).orElse(0); // Optional.orElse returns the value or a default value if there is none

    }

    private static List<Integer> filterOddFP(List<Integer> list1) {
	return list1.stream().filter(el -> {
	    return el % 2 == 1;
	}).collect(Collectors.toList());
    }

    private static List<Integer> filterEvenFP(List<Integer> list1) {
	return list1.stream().filter(el -> {
	    return el % 2 == 0;
	}).collect(Collectors.toList());
    }

    private static List<Integer> squaresFP(List<Integer> nums) {
	return nums.stream().map(e -> {
	    return e * e;
	}).collect(Collectors.toList());

    }
}
