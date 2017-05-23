
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programa_Login {

    BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

    public static boolean validacorreo(String valor) {
        String correo[];
        boolean encontro;
        int largocorreo;
        int x;
    
        largocorreo = valor.length();
        correo = new String[largocorreo];
        
        encontro = false;
        
        for (x = 0; x <= largocorreo - 1; x++) {
            if (encontro == false) {
                correo[x] = valor.substring(x, x + 1);
                if (correo[x].equals("@")) {
                    encontro = true;
                }
            }
        }
        return encontro;
    }

    public static String validacontrasenia(String valor) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        
        String contra;
        String contrasenia = "";
        int largo;
        String pws;
        pws = valor;
        largo = pws.length();

        if (largo == 8) {
            contrasenia = pws;
        } else {
            System.out.println("Debe ingresar una contrasenia de 8 caracteres");
            contra = bufEntrada.readLine();
            contrasenia = contra;
        }
        return contrasenia;
    }

    public static void logearse(String u, String c) {
        String user = "wac";
        String contrasenia = "miowac13";
        
        if (user.equals(u) && contrasenia.equals(c)) {
            System.out.println("Bienvenido "+u+" al Sistema");
        } else {
            System.out.println("Error de Usuario y/o Contraseñ  a ....");
        }
    }

    // Formulario de Registro
    public static void formulario(String user, String contrasenia) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        
        String apellido;
        String nombre;
        
        String contra;
        String contra1;
        String email;

        boolean encontro;

        String usuario = "";
        boolean vali;

        System.out.println("Complete los campos requeridos para registrarse");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        
        System.out.println("Ingrese su Apellido");
        apellido = bufEntrada.readLine();
        
        System.out.println("Ingrese su Nombre");
        nombre = bufEntrada.readLine();
        
        do {
            System.out.println("Ingrese su Correo Electronico");
            email = bufEntrada.readLine();
            encontro = validacorreo(email);
        } while (!(encontro));
        
        System.out.println("Ingrese un Usuario");
        usuario = bufEntrada.readLine();
        user = usuario;
        System.out.println("Ingrese una Contraseña");
        contra = bufEntrada.readLine();
        contrasenia = validacontrasenia(contra);
        System.out.println("Reingrese de nuevo su Contraseña");
        vali = false;
        do {
            contra1 = bufEntrada.readLine();
            if (contrasenia == contra1) {
                System.out.println("Contrasenia Confirmada...");
                vali = true;
            }
        } while (!(vali));
        System.out.println(""); // no hay forma directa de borrar la consola en Java
    }

    public static void formulariologin(String user, String contrasenia) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        
        String pws="";
        String usuario="";
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Ingrese su Usuario");
        user = bufEntrada.readLine();
        System.out.println("Ingrese su Clave");
        pws = bufEntrada.readLine();
        logearse(user, pws);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
    }

    // Inicio del programa
    public static void main(String args[]) {
        String contrasenia;
        String user;
        user = "";
        contrasenia = "";

        try {
            formulario(user, contrasenia);
            formulariologin(user, contrasenia);
        } catch (IOException ex) {
            Logger.getLogger(Programa_Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
