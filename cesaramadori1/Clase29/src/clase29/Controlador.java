/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase29;

import java.util.Scanner;


public class Controlador {
    
    protected IVista unaVista;
    protected PerfilDeUsuario elusuario;
    
    public Controlador(IVista unaVista){
        this.unaVista = unaVista;
    }
    public void run(){
    Scanner sc = new Scanner(System.in);
        unaVista = new VistaConsola();
        elusuario = new PerfilDeUsuario();
        unaVista.Mostar("Bienvenido al sistema de registro de usuario");
        
        unaVista.Mostar("\nIngrese su email");
      
        boolean emailok = false;
        String email =  sc.nextLine();
        
        while(emailok==false){
            if (verificar_email(email)) {
                emailok=true;
                elusuario.setEmail(email);
            }else{
                emailok=false;
                
                unaVista.Mostar("\n"+email+"no es un email valido!!!");
                unaVista.Mostar("Ingrese nuevamente su email");
                email =  sc.nextLine();
            }
        }
        
        unaVista.Mostar("\nIngrese su usuario");
        elusuario.setUsuario(sc.nextLine());
        
        unaVista.Mostar("\nIngrese su contraseña (Minimo 8 caracteres)");
        boolean passok = false;
        String pass1 = sc.nextLine().toLowerCase();
        String pass2;
        while(passok == false){
            
            if (pass1.length()<=7) {
                    unaVista.Mostar("\nLa contraseña no cumple con los requisitos");
                    passok = false;
                    unaVista.Mostar("\nIngrese su contraseña");
                    pass1 = sc.nextLine().toLowerCase();
                    //unaVista.Mostar("error menos de 8");
            }else{
                    unaVista.Mostar("\nVuelva a ingresar su contraseña(Repetir)");
                    pass2= sc.nextLine().toLowerCase();
                    if (pass1.equals(pass2)) {
                        passok = true;
                        elusuario.setPassword(pass1);
                        unaVista.Mostar("Contraseña verificada!");
                    }
                    pass1="";
            }
                
        }      

        unaVista.Mostar("\nIngrese su Nombre: ");
        elusuario.setNombre(sc.nextLine());
        
        unaVista.Mostar("\nIngrese su apellido");
        elusuario.setApellido(sc.nextLine());
        
        unaVista.Mostar("\nIngrese su edad");
        elusuario.setEdad(sc.nextInt());
        
        unaVista.Mostar("\nIngrese su sexo");
        elusuario.setSexo(sc.next().toLowerCase());
        
        unaVista.Mostar("\nIngrese su dni");
        elusuario.setDni(sc.nextInt());
        
        
    
    }
    public boolean verificar_email(String email){
        
        int emaillong = email.length();
        int hayarroba = 0;
        int x = 0;
        String emailchar;
        boolean emailvalido = false;
        do {
			emailchar = email.substring(x,x+1);
			if ((emailchar.equals("@"))) {
				emailvalido = true;
				hayarroba = hayarroba+1;
			}
			x = x+1;
		} while (x<emaillong);
        if (emailvalido== true && hayarroba == 1 ) {
            return true;
        }else{ 
            return false;
        }
        
    
    }
    
}