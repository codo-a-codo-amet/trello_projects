/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software.de.gestion;


import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Main {

    
    
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
        boolean contravalida;
		String email;
		boolean emailvalido;
		double ingresook;
		boolean ingresopermitido;
		String nada;
		String pass;
		String user;
		email = "";
		user = "";
		pass = "";
		emailvalido = false;
		contravalida = false;
		System.out.println("Pagina de registro del sistema");
		System.out.println(" ");
		// Validacion de Email y reingreso del mismo
		do {
			email = login();
			if ((email.equals(""))) {
				System.out.println("Ingreso un email invalido");
				System.out.println("Ingrese una tecla para continuar....");
				nada = sc.nextLine();
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				emailvalido = false;
			} else {
				emailvalido = true;
			}
		} while (emailvalido!=true);
		user = usuario();
		// Validacion de Contraseña y reingreso de la misma
		do {
			pass = contrasenia();
			if ((pass.equals(""))) {
				System.out.println("Ingreso un contraseña invalida.La contraseña debe tener al menos 8 caracteres");
				System.out.println("Ingrese una tecla para continuar....");
				nada = sc.nextLine();
				contravalida = false;
			} else {
				contravalida = true;
			}
		} while (contravalida!=true);
		System.out.println("Gracias por registrarse en nuestro sistema");
		System.out.println(" ");
		System.out.println("Ingrese una tecla para continuar");
		nada = sc.nextLine();
		System.out.println(""); // no hay forma directa de borrar la consola en Java
                //System.out.println("El Email ingresado es "+ email);
                //System.out.println("El usuario ingresado es "+ user);
                //System.out.println("El password ingresado es "+ pass);
		// Imprimir "El Email ingresado es ", email
		// Imprimir "El Usuario ingresado es ", user
		// Imprimir "La contraseña ingresada es ", pass
		System.out.println("Pantalla de Ingreso al sistema");
		System.out.println(" ");
		do {
			ingresopermitido = false;
			ingresook = ingreso(user,pass,email);
			if ((ingresook==1)) {
				System.out.println(" ");
				System.out.println("************************");
				System.out.println("*Bienvenido al sistema.*");
				System.out.println("************************");
				ingresopermitido = true;
			} else {
				System.out.println("Alguno de los datos es invalido.");
				ingresopermitido = false;
			}
		} while (ingresopermitido!=true);
	}
public static double ingreso(String user, String pass, String email) throws IOException {
                Scanner sc = new Scanner(System.in);
		String contralogin;
		String emaillogin;
		double ingreso_ok;
		String userlogin;
		System.out.println("Ingrese el Usuario");
                //System.out.println(user);
		userlogin = sc.nextLine();
		System.out.println("Ingrese la Contraseña");
                //System.out.println(pass);
		contralogin = sc.nextLine();
		System.out.println("Ingrese su Email");
                //System.out.println(email);
		emaillogin = sc.nextLine();
		if ((user.equals(userlogin) && pass.equals(contralogin) && email.equals(emaillogin))) {
			ingreso_ok = 1;
		} else {
			// Imprimir user, " ! " ,userlogin
			// Imprimir pass ," ! ",contralogin
			// Imprimir email ," ! ", emaillogin
			ingreso_ok = 0;
		}
		return ingreso_ok;
	}
// Funcion de Ingreso de Email validando el arroba
	public static String login() throws IOException {
            Scanner sc = new Scanner(System.in);
		String caracteremail;
		String email;
		String emailok;
		boolean emailvalido;
		double hayarroba;
		int largoemail;
		int x;
		System.out.println("Ingrese su Email");
		email = sc.nextLine();
		largoemail = email.length();
		x = 0;
		emailvalido = false;
		hayarroba = 0;
		do {
			caracteremail = email.substring(x,x+1);
			if ((caracteremail.equals("@"))) {
				emailvalido = true;
				hayarroba = hayarroba+1;
			}
			x = x+1;
		} while (x<largoemail);
		if ((hayarroba>1 || hayarroba<1)) {
			emailok = "";
		} else {
			emailok = email;
		}
		return emailok;
	}
        
        // Funcion Ingreso de contraseña validando la longitud
	public static String contrasenia() throws IOException {
            Scanner sc = new Scanner(System.in);
		int largopass;
		String passok;
		String passverif;
		String password;
		System.out.println("Ingrese su contraseña");
		password = sc.nextLine();
		System.out.println("Vuelva a ingresar su contraseña");
		passverif = sc.nextLine();
		largopass = password.length();
		if (((password.equals(passverif)) && (largopass>=8))) {
			passok = password;
		} else {
			passok = "";
		}
		return passok;
	}
        // Funcion ingreso de usuario sin validacion
	public static String usuario() throws IOException {
            Scanner sc = new Scanner(System.in);
		String user;
		String userok;
		System.out.println("Ingrese su usuario");
		user = sc.nextLine();
		userok = user;
		return userok;
	}
}
    