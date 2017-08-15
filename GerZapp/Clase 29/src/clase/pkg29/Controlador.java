package clase.pkg29;
import java.util.*;

public class Controlador {
    
    protected IView unaVista;
    
    protected UserProfile profile;
    
    public Controlador(IView unaVista){
        this.unaVista = unaVista;
    }
    
    public void run(){
        
        String nombre = "";
        String apellido = "";
        String nombre_usuario = "";
        String password = "";
        String email = "";

        UserProfile profile = null;
        
        Scanner aScanner = new Scanner(System.in);

        //confirmar password y confirm_password son iguales y ademas
        //su longitud es mayor a 8 caracteres
        
           
            Boolean registraion_complete = Boolean.FALSE;

            while (registraion_complete != Boolean.TRUE) {
            unaVista.Draw("Ingrese Nombre de Usuario");
            nombre_usuario = aScanner.next();

            unaVista.Draw("Ingrese email");
            email = aScanner.next();
            // confirmar si es un email
            if (email.indexOf("@") == -1) {
                unaVista.Draw("Error debe ingresar email valido");
                continue;
            }

            unaVista.Draw("Ingrese Contraseña");
            password = aScanner.next();

            if (password.length() < 8) {
                unaVista.Draw("Error debe ingresar una contraseña mayor a 8");
                continue;
            }

            unaVista.Draw("Ingrese Confirmacion de Contraseña");
            String confirm_password = aScanner.next();

            // Confirmar si password y confirm_password son iguales Y ademas
            // su longitud es mayor a 8 caracteres
            
            if ( password.compareTo(confirm_password) == 0) {
                registraion_complete = Boolean.TRUE;
                profile = new UserProfile(email, password, email, nombre, apellido);
            } else {
                unaVista.Draw("Error contraseña y confirmacion incorrectas");
            }
        }
    }
}
