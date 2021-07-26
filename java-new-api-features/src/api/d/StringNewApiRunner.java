package api.d;

/*
 * new methods for String:
 * isBlank() detects if there are nonspace characters in a string
 * strip(), stripLeading() and stripTrailing() remove blanks at any side of the string
 * lines() converts several lines into a stream for functional programming
 * transform() in functional programming is an intermediate function to modify strings
 * formatted() works as a printf to generate strings
 * enhanced throwing null pointer exception (now it says what is null)
 */
public class StringNewApiRunner {

    public static void main(String[] args) {
	System.out.println("   ".isBlank());

	System.out.println("  L R  ".strip().replace(" ", "-"));
	System.out.println("  L R  ".stripLeading().replace(" ", "-"));
	System.out.println("  L R  ".stripTrailing().replace(" ", "-"));

	"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

	System.out.println("ABCDEFGHIJK".transform(s -> s.substring(3)));

	System.out.println("My name is %s and I am %d years old".formatted("Cesar", 25));

//	String str = null;
//	System.out.println(str.isBlank());
	// this throws:
	// Exception in thread "main" java.lang.NullPointerException: Cannot invoke
	// "String.isBlank()" because "str" is null
	// at api.d.StringNewApiRunner.main(StringNewApiRunner.java:28)
	// and we know the string is null

	// If I encapsulate the string in a class:
//	SampleClass sample = new SampleClass();
//	System.out.println(sample.str.isBlank());
	// This throws:
	// Exception in thread "main" java.lang.NullPointerException: Cannot invoke
	// "String.isBlank()" because "sample.str" is null
	// at api.d.StringNewApiRunner.main(StringNewApiRunner.java:37)

	// Now it gives "sample.str" as null also
    }

}

class SampleClass {
    String str = null;
}