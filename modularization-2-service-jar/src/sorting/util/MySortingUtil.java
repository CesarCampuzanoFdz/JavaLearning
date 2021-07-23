package sorting.util;

import java.util.List;

import sorting.algorithm.BubbleSort;

//A simple Util to be consumed that uses a algorithm (BubbleSort)
public class MySortingUtil {

    public List<String> sort(List<String> names) {
	BubbleSort bsort = new BubbleSort();
	return bsort.sort(names);
    }

}
