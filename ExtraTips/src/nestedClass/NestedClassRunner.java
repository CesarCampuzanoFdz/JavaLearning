package nestedClass;

/*
 * Static and non-static nested classes:
 * Non-static nested classes cannot be created in the class they are defined without
 *  an instance of the container class while static can be.
 */

public class NestedClassRunner {

    int i = 6;

    // A nested class is a non-static class in another
    class InnerClass {
	public void method() {
	    System.out.println(i);
	}

    }

    // A static nested class is a static class in another
    static class StaticInnerClass {
	public void method() {
	    // As this is a static class, non-static variables cannot be accessed
	    // System.out.println(i);
	}
    }

    public static void main(String[] args) {
	StaticInnerClass sic = new StaticInnerClass(); // This can be done
	// InnerClass ic = new InnerClass(); //This raise a compilation error

	// To create an instance of the inner class an instance of the container is
	// needed:
	NestedClassRunner ncr = new NestedClassRunner();
	InnerClass ic = ncr.new InnerClass();
    }

}
