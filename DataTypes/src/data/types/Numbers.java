package data.types;

public class Numbers {
//constructors
    public Numbers() {
	this(2, 3);
    }

    public Numbers(int first, int second) {
	setFirst(first);
	setSecond(second);
    }

//variables
    private int first;
    private int second;

//behaviour
    public int add() {
	return (this.first + this.second);
    }

    public int multiply() {
	return (this.first * this.second);
    }

    public void doubleThem() {
	this.first *= 2;
	this.second *= 2;
    }

// getters and setters
    public int getFirst() {
	return first;
    }

    public void setFirst(int first) {
	this.first = first;
    }

    public int getSecond() {
	return second;
    }

    public void setSecond(int second) {
	this.second = second;
    }

    public double divide() {
	return (double) this.first / this.second;

    }

}
