package exception_handling;

/*The Throwable class has 2 subclasses:
    -Error: like shortage of memory (overflow stack). It cannot be handled, just prevented
    -Exception: can be handled, and it has two types of subclasses:
    	-RuntimeException: and all of its subclasses can be ignored since they are not that risky
    	-All Exceptions not Runtime or subclasses: Are risky and needed to be handled
    
*/
public class CheckedExceptionRunner {

    public static void main(String[] args) {

	try {
	    Thread.sleep(2000); // This line forces an exception handling, here with a try/catch
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}

	try {
	    someOtherMethod();// This is forced to be in a try/catch or the method it called to be handled
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	someOtherMethod2(); // This does not need to be handled
    }

    private static void someOtherMethod() throws InterruptedException {
	Thread.sleep(1000); // This line forces an exception handling, here throwing a InterruptedException
			    // to whoever calls this method to handle it
	// InterruptedException is not a subClass of RuntimeException and therefore a
	// Checked Exception

    }

    private static void someOtherMethod2() throws RuntimeException {
	// here, this method could return a RuntimeException (an Unchecked Exception) as
	// any of classes that super RuntimeException.
    }

}
