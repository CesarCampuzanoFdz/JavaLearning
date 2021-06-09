package voladores;

public class VoladoresRunner {
    public static void main(String[] args) {

	ObjetoVolador[] ovis = { new Bird(), new Plane() };
	for (ObjetoVolador ovi : ovis) {
	    System.out.println(ovi.getClass());
	    ovi.fly();
	    ovi.stop();
	}

    }
}
