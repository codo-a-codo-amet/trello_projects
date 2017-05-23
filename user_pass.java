/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String apellido;
		int contador1;
		String contrasena1;
		String contrasena2;
		String contrasenareg;
		String contraseña1;
		String contraseña2;
		String contraseñareg;
		String email;
		String emailreg;
		double email_verif;
		String nombre;
		System.out.println("Ingrese Nombre ");
		nombre = bufEntrada.readLine();
		System.out.println("Ingrese Apellido ");
		apellido = bufEntrada.readLine();
		do {
			System.out.println("Ingrese Contraseña (min 8 caracteres)");
			contrasena1 = bufEntrada.readLine();
		} while (contrasena1.length()<8);
		do {
			System.out.println("Repetir Contraseña ");
			contrasena2 = bufEntrada.readLine();
		} while (!contrasena1.equals(contrasena2));
		do {
			System.out.println("Ingrese e-Mail ");
			email = bufEntrada.readLine();
			do {
				contador1 = contador1+1;
				if (email.substring(contador1,contador1+1).equals("@")) {
					email_verif = 1;
				}
			} while (!(email_verif==1 || contador1>email.length()));
			contador1 = 0;
		} while (email_verif!=1);
		// Borrar Pantalla
		System.out.println("Bienvenido sus datos de registro son: ");
		System.out.println(" Nombre : "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println(" e-Mail : "+email);
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		do {
			System.out.println("Inicie Sesion ingresando e-Mail y contraseña ");
			emailreg = bufEntrada.readLine();
			contrasenareg = bufEntrada.readLine();
			if (emailreg.equals(email) && contrasena1.equals(contrasenareg)) {
				System.out.println("Inicio exitoso");
			} else {
				System.out.println("Verifique los datos");
			}
		} while (!(emailreg.equals(email) && contrasena1.equals(contrasenareg)));
	}


}

