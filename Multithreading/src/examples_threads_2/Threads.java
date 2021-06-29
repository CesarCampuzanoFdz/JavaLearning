package examples_threads_2;

import java.util.concurrent.Callable;

// I create a generic task to run in threads with a constructor to distiguish them
class Task extends Thread {

    private int num;

    // A constructor to assign the num
    public Task(int num) {
	super();
	this.num = num;
    }

    public void run() {
	System.out.printf("Start of Task %d\n", num);
	int init = num * 100;
	for (int i = init; i <= (init + 100); i++) {
	    System.out.print(i + " ");
	}
	System.out.printf("\nEnd of Task %d\n", num);

    }
}

class CallableTask implements Callable<String> {
    private String name;

    public CallableTask(String name) {
	this.name = name;
    }

    @Override
    public String call() throws Exception {
	Thread.sleep(2000);
	return String.format("Hello there, %s", name);
    }

}

// Old tasks ----------------
class Task1 extends Thread {
    public void run() {
	System.out.println("Start of Task 1\n");
	for (int i = 101; i <= 199; i++) {
	    System.out.print(i + " ");
	}
	System.out.println("\nEnd of Task 1");
    }
}

class Task2 implements Runnable {

    public void run() {
	System.out.println("Start of Task 2\n");
	for (int i = 201; i <= 299; i++) {
	    System.out.print(i + " ");
	}
	System.out.println("\nEnd of Task 2");
    }
}
