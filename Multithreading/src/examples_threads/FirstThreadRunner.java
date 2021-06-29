package examples_threads;

/* I want to run 3 tasks, and do it not-secuencially, to maximize the usage of CPU I use Threads:
	A thread can be in 5 states:
    - NEW: After the class is created, but before the .start()
    - RUNNABLE: It has .start() but no really started, it is waiting to get the CPU
    - RUNNING: It is executing its code
    - BLOCKED/WAITING: It is waiting for an external service or other threads
    - DEAD/TERMINATED: It has finished, and no longer does nothing		
*/

// for that, we create a class extending Thread:
class Task1 extends Thread {

    // Thread class need a public void run() containing the code
    public void run() { // It is called a SIGNATURE
	System.out.println("Start of Task 1\n");
	for (int i = 101; i <= 199; i++) {
	    System.out.print(i + " ");
	}
	System.out.println("\nEnd of Task 1");
    }
}

// Also for that, it can implement Runnable:
class Task2 implements Runnable {

    // Also contains a public void run() containing the code
    public void run() { // It is called a SIGNATURE
	System.out.println("Start of Task 2\n");
	for (int i = 201; i <= 299; i++) {
	    System.out.print(i + " ");
	}
	System.out.println("\nEnd of Task 2");
    }
}

public class FirstThreadRunner {

    public static void main(String[] args) {
	System.out.println("Start of MAIN\n");

	// Task 1
	Task1 task1 = new Task1(); // STATE NEW
	System.out.println("Task 1 Kick off!\n");
	// I use .start() and not .run(), because run method is not parallel execution!
	task1.start(); // HERE AND UNTIL IT REALLY STARTS EXECUTING IS IN STATE RUNNABLE
		       // WHEN IT REALLY STARTS EXECUTING, IT IS IN STATE RUNNING

	// Task 2
	// I create a Runnable
	Task2 task2 = new Task2();
	// but I need a Thread to run it on for parallel execution!
	Thread threadForTask2 = new Thread(task2);
	System.out.println("Task 2 Kick off!\n");
	// Here I use .start() also
	threadForTask2.start();

	// Task 3
	System.out.println("Start of Task 3\n");
	for (int i = 301; i <= 399; i++) {
	    System.out.print(i + " ");
	}
	System.out.println("\nEnd of Task 3");

	System.out.println("\nEnd of MAIN");
    } // BOTH THREADS ARE IN STATE TERMINATED/DEAD

}
