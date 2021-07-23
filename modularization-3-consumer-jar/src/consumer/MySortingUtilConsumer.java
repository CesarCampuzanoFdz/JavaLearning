package consumer;

import java.util.List;
import java.util.logging.Logger;

import sorting.util.MySortingUtil;

// Consumer to test the public util in an expected way:
public class MySortingUtilConsumer {
    // I use a logger to print the information, so it needs to be created and
    // imported:
    public static Logger log = Logger.getLogger(MySortingUtilConsumer.class.getName());

    public static void main(String[] args) {

	MySortingUtil util = new MySortingUtil();
	List<String> sorted = util.sort(List.of("César", "Lara", "Jack"));
	// This log.info creates an entry of the log:
	log.info(sorted.toString());

    }

}
