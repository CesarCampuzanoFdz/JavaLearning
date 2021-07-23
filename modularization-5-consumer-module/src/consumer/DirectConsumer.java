package consumer;

import java.util.List;
import java.util.logging.Logger;

import sorting.algorithm.BubbleSort;

//To add access of this jar to the modularization-2-service-jar I need to do:
// right click on the project -> Properties -> Java Build Path -> ClassPath -> Add 
//-> and select the project we need to use
//(The project needs to be opened)

//with this method, the consumer has access to both the algorithm and the util, so it
//is not used as intended.

// Consumer to test the public BubbleSort without the util, in an unintended way:
public class DirectConsumer {
    // I use a logger to print the information, so it needs to be created and
    // imported:
    public static Logger log = Logger.getLogger(DirectConsumer.class.getName());

    public static void main(String[] args) {

	// THis consumer skips your util, potentially causing problems:
	// This is the reason for MODULARIZATION, so other programmers do not use
	// wrongly your code

	BubbleSort util = new BubbleSort();// NOW IT DOES NOT COMPILE, SINCE THE MODULE OF THE SERVICE
					   // PROVIDER DOES NOT EXPORT THE ALGORITHM

	List<String> sorted = util.sort(List.of("César", "Lara", "Jack"));
	// This log.info creates an entry of the log:
	log.info(sorted.toString());

    }

}
