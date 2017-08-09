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

public class password {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double count;
		String dbpass;
		String dbuser;
		String dspass;
		String dsuser;
		boolean islogincorret;
		String password;
		String user;
		dsuser = "juan";
		dspass = "topo";
		count = 0;
		do {
			System.out.println("ingrese usuario");
			user = bufEntrada.readLine();
			System.out.println("ingrese contaseña");
			password = bufEntrada.readLine();
			count = count+1;
			islogincorret = (user==dsuser) && (password==dspass);
			if (islogincorret) {
				System.out.println("Bienvenido"+user);
			} else {
				System.out.println("usuario y/o contraseña incorrectos");
			}
		} while (count<3 || islogincorret);
		if (count>=3) {
			System.out.println("sos un pancho... bloqueast el usuario");
		}
	}


}


}
