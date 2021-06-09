package voladores;

public class Plane implements ObjetoVolador {

    @Override
    public void fly() {
	System.out.println("Vuela con motores");

    }

    @Override
    public void stop() {
	System.out.println("Aterriza");
    }

}
