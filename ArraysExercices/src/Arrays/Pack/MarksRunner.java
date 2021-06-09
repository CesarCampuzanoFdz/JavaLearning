package Arrays.Pack;

import java.util.Arrays;

public class MarksRunner {
    public static void main(String[] args) {

	Student alumno = new Student();
	Student alumno2 = new Student("Lara", 10, 9, 11, 12, 100);
	alumno.setName("César");
	double[] marks = new double[10];
	Arrays.fill(marks, 10);
	marks[1] = 9.8;
	marks[2] = 9.7;
	alumno.setMarks(marks);
//	System.out.println(Arrays.toString(marks));
//	System.out.println();
//	System.out.printf("Student: %s\n", alumno2.getName());
//	System.out.printf("Number of Marks: %d\n", alumno2.numberOfMarks());
//	System.out.printf("Sum of Marks: %.2f\n", alumno2.sumOfMarks());
//	System.out.printf("Max of Marks: %.2f\n", alumno2.maxOfMarks());
//	System.out.printf("Min of Marks: %.2f\n", alumno2.minOfMarks());
//	System.out.printf("Avg of Marks: %.2f\n", alumno2.avgOfMarks());
	System.out.printf("%s\n", alumno);
	alumno.addMark(2.4);
	System.out.printf("%s\n", alumno);
	alumno.removeMarkAtIndex(10);
	System.out.printf("%s\n", alumno);
	System.out.printf("%s\n", alumno2);

    }
}
