package functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionsPlays {

    public static void main(String[] args) {

	// The functions (or predicates or consumers) can be stored in variables or be
	// returned from methods (can be done using refactor of Eclipse IDE)

	List.of(-1, 2, 3, -4, 1, 5, 2, 7, -214, 123, 151).stream().map(e -> Math.abs(e)).filter(e -> e % 2 == 0)
		.forEach(e -> System.out.println(e));

	// a couple of variables that contains functions
	Function<? super Integer, ? extends Integer> absFunction = e -> Math.abs(e);
	Predicate<? super Integer> isEvenPredicate = methodThatReturnsPredicate();

	List.of(-1, 2, 3, -4, 1, 5, 2, 7, -214, 123, 151).stream().map(absFunction).filter(isEvenPredicate)
		.forEach(FunctionsPlays.methodThatReturnsConsumer());
    }

    // a method that returns a consumer
    private static Consumer<? super Integer> methodThatReturnsConsumer() {
	return e -> System.out.println(e);
    }

    // a method that returns a predicate
    private static Predicate<? super Integer> methodThatReturnsPredicate() {
	return e -> e % 2 == 0;
    }

}
