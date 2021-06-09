package Collections;

import java.util.LinkedList;
import java.util.List;

public class StudentCollectionRunner {

    public static void main(String[] args) {
	List<Student> students = List.of(new Student(100, "Cesar"), new Student(12, "Lara"), new Student(50, "Bib"));
	System.out.println(students);

	LinkedList<Student> studentAl = new LinkedList<>(students);
	studentAl.sort(new DescendingSortingStudents());
	System.out.println(studentAl);
    }

}
