package examples_threads;

/*
This runner is the same as FirstThreadRunner.java, but it does some extra things!
	- Priorities are defined between 1 and 10 (10 has MORE prioriry than 1), but they are only a request,
	 so they may not be honored! The default prioriry if not setted, it is 5
	- .join() on a thread waits for it to terminated
	- Thread.sleep() is a static method that just waits
	- Thread.yield() is a hint that can be called in a thread (in the run) to give CPU if needed.
	 As a priority, it can be ignored by the scheduler
	- Only a Thread can execute a class tagged as "synchonized", even if there's 1000000 lines of
	 synchonized code, only a thread can be executing some of it at any time
*/

public class SecondThreadRunner {
    // join needs an exception, I'll see it later
    public static void main(String[] args) throws InterruptedException {
	System.out.println("Start of MAIN\n");

	// Task 1
	Task1 task1 = new Task1();
	System.out.println("Task 1 Kick off!\n");
	task1.setPriority(1);
	task1.start();

	// Task 2
	Task2 task2 = new Task2();
	Thread threadForTask2 = new Thread(task2);
	System.out.println("Task 2 Kick off!\n");
	threadForTask2.setPriority(10);
	threadForTask2.start();

	// I'll wait for both to die before ending main
	task1.join();
	threadForTask2.join();

	// I can use a static method in Thread to just wait:
	Thread.sleep(10000); // It uses milliseconds, so 10.000ms = 10s

	// Task 3
	System.out.println("Start of Task 3\n");
	for (int i = 301; i <= 399; i++) {
	    System.out.print(i + " ");
	}
	System.out.println("\nEnd of Task 3");

	System.out.println("\nEnd of MAIN");
    }

}
