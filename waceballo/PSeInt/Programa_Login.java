/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "LOGIN.java."

// Hay dos errores que se pueden generar al exportar un algoritmo con subprocesos desde PSeint a Java:
// 1) En java no se puede elegir entre pasaje por copia o por referencia. Técnicamente solo existe el
// pasaje por copia, pero los identificadores de objetos representan en realidad referencias a los
// objetos. Entonces, el pasaje para tipos nativos actúa como si fuera por copia, mientras que el
// pasaje para objetos (como por ejemplo String) actúa como si fuera por referencia. Esto puede llevar
// a que el algoritmo exportado no se comporte de la misma forma que el algoritmo original, en cuyo
// caso deberán modificarse algunos métodos (subprocesos exportados) para corregir el problema.
// 2) Las funciones que hacen lectura por teclado deben lazar una excepción. Si una función A es
// invocada por otra B, B también debe manejar (lanzar en este caso) las execpciones que lance A.
// Esto no se cumple en el código generado automáticamante: las funciones que realizan lecturas
// directamente incluyen el código que indica que pueden generar dicha excepción, pero las que
// lo hacen indirectamente (invocando a otras que sí lo hacen), puede que no, y deberán ser
// corregidas manualmente.

import java.io.*;

public class login {
	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

	public static boolean validacorreo(String valor) {
		String correo[];
		boolean encontro;
		int largocorreo;
		int x;
		largocorreo = valor.length();
		correo = new String[largocorreo];
		encontro = false;
		for (x=0;x<=largocorreo-1;x++) {
			if (encontro==false) {
				correo[x] = valor.substring(x,x+1);
				if (correo[x].equals("@")) {
					encontro = true;
				}
			}
		}
		return encontro;
	}

	public static String validacontrasenia(String valor) throws IOException {
		String contra;
		String contrasenia;
		int largo;
		String pws;
		pws = valor;
		largo = pws.length();
		if (largo==8) {
			contrasenia = pws;
		} else {
			System.out.println("Debe ingresar una contrasenia de 8 caracteres");
			contra = bufEntrada.readLine();
		}
		return contrasenia;
	}

	public static void logearse(String u, String c, String user, SIN_TIPO pws) {
		String contrasenia;
		if (user==u && contrasenia==c) {
			System.out.println("Bienvenido al Sistema");
		} else {
			System.out.println("Error de Usuario y/o Contraseña ....");
		}
	}

	// Formulario de Registro
	public static void formulario(String user, String contrasenia) throws IOException {
		String apellido;
		String contra;
		String contra1;
		String email;
		boolean encontro;
		String nombre;
		String usuaio;
		String usuario;
		boolean vali;
		System.out.println("Complete los campos requeridos para registrarse");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Ingrese su Nombre");
		nombre = bufEntrada.readLine();
		System.out.println("Ingrese su Apellido");
		apellido = bufEntrada.readLine();
		System.out.println("Ingrese su Correo Electronico");
		do {
			email = bufEntrada.readLine();
			encontro = validacorreo(email);
		} while (!(encontro));
		System.out.println("Ingrese un Usuario");
		usuario = bufEntrada.readLine();
		user = usuaio;
		System.out.println("Ingrese una Contraseña");
		contra = bufEntrada.readLine();
		contrasenia = validacontrasenia(contra);
		System.out.println("Reingrese de nuevo su Contraseña");
		vali = false;
		do {
			contra1 = bufEntrada.readLine();
			if (contrasenia==contra1) {
				System.out.println("Contrasenia Confirmada...");
				vali = true;
			}
		} while (!(vali));
		System.out.println(""); // no hay forma directa de borrar la consola en Java
	}

	public static void formulariologin(String user, SIN_TIPO contrasenia) throws IOException {
		String pws;
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Ingrese su Usuario");
		user = bufEntrada.readLine();
		System.out.println("Ingrese su Clave");
		pws = bufEntrada.readLine();
		logearse(user,pws,usuario,contrasenia);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	}

	// Inicio del programa
	public static void main(String args[]) {
		String contrasenia;
		String user;
		user = "";
		contrasenia = "";
		formulario(user,contrasenia);
		formulariologin(user,contrasenia);
	}


}

