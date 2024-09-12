import javax.swing.JOptionPane;

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
	public static boolean ValidarDni(String dni) {
		boolean letra = false;
		if (dni.length()<7 || dni.length()>8) {
			return false;
		} else {
			for (int i = 0; i < dni.length(); i++) {
				if (Character.isLetter(dni.charAt(i))) {
					letra=true;
				}
			}
			if (letra==true) {
				JOptionPane.showMessageDialog(null, "No puede tener letras el DNI");
				return false;
			} else {
				return true;
			}
		}	
	}
	public static boolean ValidarPatente(String patente) {
		boolean mayus = false;
		int contMayus = 0;
		boolean num = false;
		int contNum = 0;
		
		if (patente.length()==7) {
			for (int i = 0; i < patente.length(); i++) {
				if (Character.isUpperCase(patente.charAt(i))) {
					mayus=true;
					contMayus++;
				}
				if (Character.isDigit(patente.charAt(i))) {
					num=true;
					contNum++;
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "La patente debe tener 7 caracteres");
			return false;
		}
		if (mayus==true && num==true && contMayus==4 && contNum==3) {
			JOptionPane.showMessageDialog(null, "Es correcta");
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "No cumple con lo pedido");
			return false;
		}
	}
	public static boolean ValidarNombre(String nombre) {
		boolean numero = false;
		if (nombre.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Está vacio el nombre");
			return false;
		} else {
			for (int i = 0; i < nombre.length(); i++) {
				if (Character.isDigit(nombre.charAt(i))) {
					numero=true;
				}
			}
			if (numero==true) {
				JOptionPane.showMessageDialog(null, "No puede tener numeros un nombre");
				return false;
			} else {
				return true;
			}
		}
	}
}
