package functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//There is 3 main interfaces in functional programming that are implemented in classes when functional programming is used
//Function: it takes an argument and returns and output
//Predicate: it takes an argument and return a boolean (true or false)
//Consumer: it takes an argument and does something with it, but returns nothing

class ExamplePredicate implements Predicate<Integer> {
    // ^ add unimplemented methods:
    @Override
    public boolean test(Integer t) {
	return t % 2 == 0;
    }

}

class ExampleConsumer implements Consumer<Integer> {
    // ^ like Predicate interface, the only unimplemented method is accept that is
    // filled with e -> System.out.println(e) in other ways
    @Override
    public void accept(Integer t) {
	System.out.println(t.intValue());

    }

}

class ExampleMapper implements Function<Integer, String> {
    // ^ add unimplemented methods:
    @Override
    public String apply(Integer t) {
	return "number is " + t.toString();
    }

}

public class BehindTheScreens {

    public static void main(String[] args) {
// The filter() method only accepts a Predicate interface, which a have an only method not implemented, test
// when we call filter(e -> e % 2 == 0)

//The same way, forEach method accepts a consumer argument, that can be declared elsewhere

	List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

	// Stream<T> filter(Predicate<? super T> predicate);
	// @FunctionalInterface
	// public interface Predicate<T>
	// boolean test(T t);

	// void forEach(Consumer<? super T> action); unlike filter, the terminal
	// operations are VOID
	// @FunctionalInterface
	// public interface Consumer<T>
	// void accept(T t);

	System.out.println();

	// the line before is equal to this:
	List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter(new ExamplePredicate()).forEach(new ExampleConsumer());

	// If I add a map method:
	List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().filter(e -> e % 2 == 0).map(new ExampleMapper())
		.forEach(e -> System.out.println(e));

	// <R> Stream<R> map(Function<? super T, ? extends R> mapper) the map method
	// return a type R while accepts a T type
	// public interface Function<T, R>
	// R apply(T t);

    }

}
