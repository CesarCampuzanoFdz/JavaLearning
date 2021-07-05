package exception_handling;

public class Exception_runner_1 {

    public static void main(String[] args) {
	// I cause an exception to raise, getting the lenght of a null str:
	// method1NotHandedException();
	method1HandedException();
	System.out.println("MAIN ENDED");

    }

    private static void method1NotHandedException() {
	method2();
	// the exception can be follow through the STACKTRACE, it fails wherever it was
	// called
	System.out.println("This is never reached");
    }

    private static void method2() {
	String str = null;
	str.length();
	// The code after the exception, if not handled never gets executed
	System.out.println("This is never reached");
    }

    private static void method1HandedException() {
	method2HandledException();
	System.out.println("This is reached because the exception was handled");
    }

    private static void method2HandledException() {
	try {
	    int arr[] = { 1, 2 };
	    int number = arr[3];
	    String str = null;
	    str.length();
	    // The code after the exception never gets executed because when an exception is
	    // raised in a try, it goes directly to the catch statement
	    System.out.println("This is never reached");
	} catch (NullPointerException ex) {
	    System.out.println("String str = null;\r\nstr.length();\nHave failed!");
	    ex.printStackTrace(); // This happens when it throws an NullPointerException and nothing else
	} catch (ArrayIndexOutOfBoundsException ex) {
	    System.out.println("int arr[] = { 1, 2 };\nint number = arr[3];\nHave failed!");
	    ex.printStackTrace(); // This happens when it throws an ArrayIndexOutOfBoundsException and nothing
				  // else
	} catch (Exception ex) {
	    ex.printStackTrace(); // This reports to the console a generic exception, because it is super all
				  // other exceptions
	}
	System.out.println("But this one is");
    }

}
