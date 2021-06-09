package voladores;

public class Bird implements ObjetoVolador {

    @Override
    public void fly() {
	System.out.println("Vuela con las alas");
    }

    @Override
    public void stop() {
	System.out.println("Se posa");
    }

}
