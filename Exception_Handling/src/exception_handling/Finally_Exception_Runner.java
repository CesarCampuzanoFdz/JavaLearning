package exception_handling;

import java.util.Scanner;

//to make sure something need to be executed 100% of the times, like closing a scanner,
//because it causes a memory leak

public class Finally_Exception_Runner {
    public static void main(String[] args) {

	// it is pre-defined because if it fails in the try, it needs to be refered to
	// be checked and closed in the finally
	Scanner scan = null;
	try {
	    scan = new Scanner(System.in);
	    int nums[] = { 1, 1, 1, 1 };
	    int num = nums[5];
	    System.out.println("this is never reached");

	} catch (Exception e) {
	    e.printStackTrace();
	} finally {// This is always executed, regardless an exception is raised or not or even it
		   // has a return in the try (it wont be executed with an System.exit)
	    if (scan != null) {
		// If the scanned has been defined, it's closed
		scan.close();
	    }
	    System.out.println("Always executed, catching an exception or not");
	}

    }
}
