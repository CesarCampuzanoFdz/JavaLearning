package api.h;

/*
 * Here record is a preview feature, but now in the last java version (java 16), it have been released.
 * A record is a way to avoid creating an specific class with constructor, hashcode, equals,
 * toString, etc... to simply store info.
 * Non-static variables or methods are not allowed
 * The constructor can be ommited, and even when ovewritten, the this.name = name; and all of that can be
 * skipped (simplified constructor)
 */

record Person(String name, String email, String phoneNumber) {
    // There is no need, but methods can be costumized:
    Person(String name, String email, String phoneNumber) {
	if (name == null) {
	    throw new IllegalArgumentException("Illegall name");
	}
	this.name = name;
	this.email = email;
	this.phoneNumber = phoneNumber;
    }
}

public class RecordsRunner {

    public static void main(String[] args) {
	Person person = new Person("Cesar", "cesarcesarcesar0@gmail.com", "012345678");
	Person person1 = new Person("Cesar", "cesarcesarcesar0@gmail.com", "012345678");
	Person person2 = new Person("Cesar1", "cesarcesarcesar0@gmail.com", "012345678");
	System.out.println(person);
	System.out.println(person.name());
	System.out.println(person.equals(person1));
	System.out.println(person.equals(person2));
    }

}
