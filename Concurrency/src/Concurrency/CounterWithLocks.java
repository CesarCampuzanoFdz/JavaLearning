package Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
In counter.java I use synchronize to allow multithreading to stop different threads to misrun the code,
 but that prevented to run incrementI in parallel with incrementJ. It causes a major loss in performance, so
 now I use Locks (like mutex) that can prevent code from running in different threads when locked.
*/
public class CounterWithLocks {
    private int i = 0;
    private int j = 0;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    public int getI() {
	return i;
    }

    public void incrementI() {
	lockForI.lock();// This "syncronize" all code between lock and unlock but only for lockForI
	// Can be also lockForI.trylock(), that can return a fail when it cannot, or
	// wait for some time before returning it
	this.i++;
	lockForI.unlock();
    }

    public int getJ() {
	return j;
    }

    public void incrementJ() {
	lockForJ.lock();
	this.j++;
	lockForJ.unlock();
    }

}
