
public class Address {
    private String barrio;
    private String municipio;
    private String comunidad;

    public Address(String barrio, String municipio, String comunidad) {
	super();
	this.barrio = barrio;
	this.municipio = municipio;
	this.comunidad = comunidad;
    }

    public String toString() {
	return String.format("barrio: %s\nmunicipio: %s\ncomunidad: %s\n", this.barrio, this.municipio, this.comunidad);
    }
}
