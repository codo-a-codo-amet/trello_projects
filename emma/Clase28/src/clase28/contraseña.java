/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28;

/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "REGISTRO_DE_USUARIO_CON_CONFIRMACION.java."

import java.io.*;

public class contraseña {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String confirmacion_contraseña;
		String confirmacion_contraseña;
		int contador1;
		String contraseña;
		String contraseña;
		String email;
		double email_con_arroba;
		String mail;
		String usuario;
		String usuario_o_mail;
		usuario = "";
		mail = "";
		email_con_arroba = 0;
		contraseña = "";
		confirmacion_contraseña = "";
		System.out.println("In  gresar ususario");
		// EL USUARIO DEBE TENER 5 CARACTERES MINIMOS                                
		usuario = " ";
		do {
			System.out.println("Ingrese usuario (debe contener 5 o más caracteres)");
			usuario = bufEntrada.readLine();
		} while (usuario.length()<5);
		System.out.println("ingresar mail");
		mail = " ";
		do {
			System.out.println("Ingrese email (debe contener @)");
			email = bufEntrada.readLine();
			do {
				contador1 = contador1+1;
				if (email.substring(contador1-1,contador1).equals("@")) {
					email_con_arroba = 1;
				}
			} while (!(email_con_arroba==1 || contador1>email.length()));
			contador1 = 0;
		} while (email_con_arroba!=1);
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("ingresar contraseña");
		// La contraseña debe tenr 8 caracteres minimos.
		contraseña = "";
		do {
			System.out.println("Ingrese contraseña (debe contener 8 o más caracteres)");
			contraseña = bufEntrada.readLine();
		} while (contraseña.length()<8);
		do {
			System.out.println("Ingrese confirmacion de contraseña");
			confirmacion_contraseña = bufEntrada.readLine();
		} while (!confirmacion_contraseña.equals(contraseña));
		System.out.println("gracias por registrarse. Bienvenid@");
		System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("ingrese usuario y/o mail");
		usuario_o_mail = bufEntrada.readLine();
		System.out.println("ingrese contraseña");
		contraseña = bufEntrada.readLine();
	}


}

