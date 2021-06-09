package functionalProgramming;

import java.util.List;

public class FunctionalProgramming2 {

    public static void main(String[] args) {
	List<Integer> list2 = List.of(2, 4, 3, 1, 6, 9, 8);

	list2.stream().forEach(element -> System.out.printf("%d ", element));
	System.out.println();

	sumOP(list2);
	sumFP(list2);
	sumFilteredFP(list2);
    }

    // Classic Object Oriented loop
    private static void sumOP(List<Integer> list2) {
	int sum = 0;
	for (int num : list2) {
	    sum += num; // <- the value of sum is changing the programm has MUTATIONS
	    // we say not only what but how to do it
	}
	System.out.println(sum);
    }

    // Loop with Functional Programming
    private static void sumFP(List<Integer> list2) {
	// to reduce the list of numbers received to just one, the sum I use .reduce
	// with 2 parameters:
	// the 0, the initial value of the sum
	// (number1, number2) -> number1 + number2, the lambda expression with the
	// arguments defined in the brackets and the code they are used post the ->

	// for example, the 1st pair would be 0 and 2, the second 2 (0+2) and 3, the
	// third 5 (0+2+3) and 1...

	int sum = list2.stream().reduce(0, (number1, number2) -> {
	    System.out.printf("number1: %d,  number2: %d", number1, number2);
	    System.out.println();
	    return number1 + number2;
	});

	System.out.println(sum);
    }

    // Loop with Functional Programming
    private static void sumFilteredFP(List<Integer> list2) {
	int sum = list2.stream().filter(num -> num < 6).reduce(0, (number1, number2) -> number1 + number2);

	System.out.println(sum);// <- the value of sum is not changing the programm has NOT MUTATIONS
	// we focus on what to do, not how
    }
}
