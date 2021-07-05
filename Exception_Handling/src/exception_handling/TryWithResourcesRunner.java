package exception_handling;

import java.util.Scanner;

public class TryWithResourcesRunner {
    public static void main(String[] args) {

	// with try(smthng) {}, with smthng implementing a AuotCloseable class, it
	// includes a "finally" with the scan.close()
	try (Scanner scan = new Scanner(System.in)) {
	    int nums[] = { 1, 1, 1, 1 };
	    int num = nums[5];
	    System.out.println("this is never reached");
	}
	// no catch or finally are necessary now, but you can put them
	System.out.println("Always executed, catching an exception or not");
    }

}
