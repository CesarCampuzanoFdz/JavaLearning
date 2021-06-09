
public class Employee extends Person {
    private String title;
    private String employer;
    private int salary;

    public Employee(String name) {
	super(name);
	System.out.println("Employee doing");

    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getEmployer() {
	return employer;
    }

    public void setEmployer(String employer) {
	this.employer = employer;
    }

    public int getSalary() {
	return salary;
    }

    public void setSalary(int salary) {
	this.salary = salary;
    }

    public String toString() {
	return String.format("%sTitle: %s\nSalary: %d", super.toString(), this.title, this.salary);
    }
}
