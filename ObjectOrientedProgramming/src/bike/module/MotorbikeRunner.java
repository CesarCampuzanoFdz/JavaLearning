package bike.module;

public class MotorbikeRunner {

    public static void main(String[] args) {

	Motorbike enduro = new Motorbike(20);
	Motorbike trial = new Motorbike();

	System.out.printf("Velocidad : %3.2fkm/h\n", enduro.getSpeed());
	System.out.printf("Velocidad : %3.2fkm/h\n", trial.getSpeed());

	enduro.start();
	trial.start();
	enduro.setSpeed(100);
	enduro.accelerate(100);
	enduro.decelerate(5000);

	System.out.printf("Velocidad : %3.2fkm/h\n", enduro.getSpeed());

    }

}
