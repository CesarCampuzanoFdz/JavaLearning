package Arrays.Pack;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;

    private ArrayList<Double> marks = new ArrayList<Double>();

    Student() {

    }

    Student(String name, double... marks) {
	this.name = name;
	for (double mark : marks) {
	    this.marks.add(mark);
	}
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public ArrayList<Double> getMarks() {
	return this.marks;
    }

    public void setMarks(double... marks) {
	for (double mark : marks) {
	    this.marks.add(mark);
	}
    }

    public int numberOfMarks() {
	return this.marks.size();
    }

    public double sumOfMarks() {
	double sum = 0;
	for (double mark : this.marks) {
	    sum += mark;
	}
	return sum;
    }

    public double maxOfMarks() {
	return Collections.max(this.marks);
    }

    public double minOfMarks() {
	return Collections.min(this.marks);
    }

    public BigDecimal avgOfMarks() {
	BigDecimal sum = new BigDecimal(this.sumOfMarks());
	BigDecimal target = new BigDecimal(this.numberOfMarks());

	return sum.divide(target, 2, RoundingMode.HALF_UP);

    }

    public String toString() {
	return "The student " + name + " has this marks: " + marks;
    }

    public void addMark(double mark) {
	this.marks.add(mark);
    }

    public void removeMarkAtIndex(int i) {
	this.marks.remove(i);

    }

}
