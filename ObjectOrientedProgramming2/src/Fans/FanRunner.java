package Fans;

public class FanRunner {

    public static void main(String[] args) {
	Fan fan1 = new Fan("manufacturer1", 1.2, "brown");
	fan1.switchOn();
	System.out.printf("fan1:\n\t%s\n", fan1);
	fan1.setSpeed((byte) 5);
	fan1.switchOn();
	System.out.printf("fan1:\n\t%s\n", fan1);
	fan1.switchOff();
	System.out.printf("fan1:\n\t%s\n", fan1);
    }
}
