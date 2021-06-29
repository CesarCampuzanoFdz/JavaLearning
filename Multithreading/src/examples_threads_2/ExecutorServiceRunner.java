package examples_threads_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*I use a Service executor to handle the thread executions 
It needs a.shutdown()at the end to end the service and really kill it*/

public class ExecutorServiceRunner {

    public static void main(String[] args) {
	System.out.println("Start of MAIN\n");
//	ExecutorService exService = Executors.newSingleThreadExecutor();
//	// Being a SingleThreadExecutor, it waits for one to die to start the next, so
//	// it is not parallel
//	exService.execute(new Task1());
//	exService.execute(new Thread(new Task2()));

	ExecutorService exService2 = Executors.newFixedThreadPool(2); // now there can be 2 active threads running
	exService2.execute(new Task(1));
	exService2.execute(new Task(2));
	exService2.execute(new Task(3));
	exService2.execute(new Task(4));
	exService2.execute(new Task(5));
	exService2.execute(new Task(6));

	System.out.println("\nEnd of MAIN");

	// exService.shutdown();
	exService2.shutdown();
    }

}
