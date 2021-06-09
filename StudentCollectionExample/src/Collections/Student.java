package Collections;

import java.util.Comparator;

//Para ordenar clases hay que decirles segun qué deben comparar, para ello se implementa Comparable<Student>
public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getId() {
	return id;
    }

    public void setId(int mark) {
	this.id = mark;
    }

    @Override
    public String toString() {
	return String.format("Student %s with id: %d", name, id);

    }

    // CompareTo debe ser int y devolver -1 si es menor que el argumento, 0 si es
    // igual y 1 si es mayor
    @Override
    public int compareTo(Student that) {
	return Integer.compare(this.id, that.id);

    }
}

class DescendingSortingStudents implements Comparator<Student> {

    @Override // Descending
    public int compare(Student st1, Student st2) {
	return Integer.compare(st2.getId(), st1.getId());
    }

}