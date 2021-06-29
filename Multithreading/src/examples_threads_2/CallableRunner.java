package examples_threads_2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
	// Although it make no sense to use a fixedthreadPool of 1, I do it:
	ExecutorService exService = Executors.newFixedThreadPool(1);

	// to execute something that returns something (a Future, the promise of a
	// result) I use .submit
	Future<String> returnedFuture = exService.submit(new CallableTask("Cesar"));

	System.out.println(returnedFuture.get());// The .get on a future forces execution to wait the thread
						 // and get the actual result

	System.out.println("\nEnd of MAIN");
	exService.shutdown();
    }

}
