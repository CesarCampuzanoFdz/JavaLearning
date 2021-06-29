package examples_threads_2;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
	// Although it make no sense to use a fixedthreadPool of 1, I do it:
	ExecutorService exService = Executors.newFixedThreadPool(5);

	// I create a list of the callable tasks to invoke them all
	List<CallableTask> callableTaskList = List.of(new CallableTask("Cesar"), new CallableTask("General Kenobi"),
		new CallableTask("Adam"), new CallableTask("Toby"), new CallableTask("NONE"));

	// invokeAll submit them all
	List<Future<String>> returnedFutures = exService.invokeAll(callableTaskList);

	// loop for results
	for (Future<String> result : returnedFutures) {
	    System.out.println(result.get());
	}
	System.out.println("\nEnd of MAIN");
	exService.shutdown();
    }

}
