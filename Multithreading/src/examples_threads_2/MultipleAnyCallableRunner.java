package examples_threads_2;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService exService = Executors.newFixedThreadPool(5);

	// I create a list of the callable tasks to invoke them all
	List<CallableTask> callableTaskList = List.of(new CallableTask("Cesar"), new CallableTask("General Kenobi"),
		new CallableTask("Adam"), new CallableTask("Toby"), new CallableTask("NONE"));

	// invokeAny submit them all, but get the result of any of them (fastest)
	String returnedFuture = exService.invokeAny(callableTaskList);

	System.out.println(returnedFuture);

	System.out.println("\nEnd of MAIN");
	exService.shutdown();
    }

}
