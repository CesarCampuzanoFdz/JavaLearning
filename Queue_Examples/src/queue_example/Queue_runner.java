package queue_example;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
//Queue provides a way to store elements to process one by one poping them out of the queue as they are being used

class StringLenghtComparation implements Comparator<String> {
    @Override
    public int compare(String value1, String value2) {
	return Integer.compare(value1.length(), value2.length());
    }
}

public class Queue_runner {

    public static void main(String[] args) {
	// In the constructor we pass the comparator to sort the queue by the lenght not
	// the alphabetical by default
	Queue<String> qu = new PriorityQueue<>(new StringLenghtComparation());

	qu.addAll(List.of("Abra", "Kadabra", "Alakazam"));

	System.out.println(qu.poll());
	System.out.println(qu.poll());
	System.out.println(qu.poll());
	System.out.println(qu);
	System.out.println(qu.offer("nuevoItem"));
	System.out.println(qu);
    }

}
