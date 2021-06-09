package bike.module;

public class Motorbike {

    public Motorbike() {
	this(6); // default speed is set to 6 by calling the other constructor
    }

    public Motorbike(double speed) {
	this.speed = speed;
    }

    private double speed = 0;

    public double getSpeed() {
	return speed;
    }

    public void setSpeed(double speed) {
	this.speed = speed;
	if (this.speed < 0) {
	    this.speed = 0;
	}
    }

    public void accelerate(double acceletarion) {
	setSpeed(this.speed + acceletarion); // the setSpeed is called to use its check

    }

    public void decelerate(double deceletarion) {
	setSpeed(this.speed - deceletarion);

    }

    public void start() {
	System.out.printf("Motorbike has started!\n");
    }

    public void stop() {
	this.speed = 0;
	System.out.printf("Motorbike has stopped\n");
    }

}
