package api.c;

import java.util.List;
import java.util.function.Predicate;

/*
 * There is a new static method in Predicate to negate a method used as predicate: Predicate.not()
 */

public class PredicateNotRunner {

    public static void main(String[] args) {
	List<Integer> numbers = List.of(1, 5, 3, 6, 7, 23, 57, 324);
	Predicate<Integer> evenNumberPredic = number -> number % 2 == 0;
	// with this predicate, I get the odd numbers:
	numbers.stream().filter(evenNumberPredic).forEach(System.out::println);
	System.out.println();
	// with the not:
	numbers.stream().filter(evenNumberPredic.negate()).forEach(System.out::println);

	System.out.println();

	// Using a method:
	numbers.stream().filter(PredicateNotRunner::isEven).forEach(System.out::println);
	System.out.println();
	numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
    }

    public static boolean isEven(Integer number) {
	return number % 2 == 0;
    }

}
