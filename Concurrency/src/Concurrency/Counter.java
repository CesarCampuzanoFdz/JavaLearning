package Concurrency;

public class Counter {
    private int i = 0;
    private int j = 0;

    public int getI() {
	return i;
    }

    // This method needs to be synchronized to be run in multithreading:
    synchronized public void incrementI() {
	this.i++; // this operation is not thread safe, since multiple threads could lost some
		  // increments if it's run paralled

//	i++ is not an atomic operation, since it involves:
//	    get i
//	    increment i
//	    write i
    }

    public int getJ() {
	return j;
    }

    // Even incrementJ is not related to incrementI, as both are synchronized only
    // one of them can be run at once. For more complex code with more syncronized
    // methods, this could be a great loss of performance
    synchronized public void incrementJ() {
	this.j++;
    }

}
