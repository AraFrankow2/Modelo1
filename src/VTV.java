
public class VTV {
	String nombre;
	int DNI;
	String patente;
	boolean motor;
	boolean frenos;
	boolean suspension;
	
	public VTV(boolean motor, boolean frenos, boolean suspension) {
		this.motor = motor;
		this.frenos=frenos;
		this.suspension=suspension;
	}
	public String Veri() {
		return nombre;
	}
}
