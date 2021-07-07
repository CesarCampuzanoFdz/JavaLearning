package Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/*
Locks are done for all types of code, but for really simple classes, atomic classes can be used.
 They assure Thread safety using atomic methods like .get() or .getAndIncrement()
*/
public class CounterWithAtomics {
    private AtomicInteger i = new AtomicInteger(0);
    private AtomicInteger j = new AtomicInteger(0);

    public int getI() {
	return i.get();
    }

    public void incrementI() {
	i.incrementAndGet();
    }

    public int getJ() {
	return j.get();
    }

    public void incrementJ() {
	j.incrementAndGet();
    }

}
