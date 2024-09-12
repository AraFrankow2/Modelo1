import javax.swing.JOptionPane;

public class Main1 {

	public static void main(String[] args) {
		String nombre;
		do {
			nombre = JOptionPane.showInputDialog("Ingrese nombre");
		} while (!VTV.ValidarNombre(nombre));
		String patente;
		do {
			patente = JOptionPane.showInputDialog("Ingrese su patente");
		} while (!VTV.ValidarPatente(patente));
		String DNI;
		do {
			DNI = JOptionPane.showInputDialog("Ingrese su DNI");
		} while (!VTV.ValidarDni(DNI));
		
		VTV validarVTV = new VTV(false, false, false);
		
	}
	
	
	

}
