/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase29;

import java.util.Scanner;


public class Controlador {
    
    protected Vista unaVista;
    protected PerfilDeUsuario elusuario;
    
    public void run(){
    Scanner sc = new Scanner(System.in);
        elusuario = new PerfilDeUsuario();
        System.out.println("Bienvenido al sistema de registro de usuario");
        
        System.out.println("\nIngrese su email");
        boolean emailok = false;
        String email =  sc.nextLine();
        
        while(emailok==false){
            if (verificar_email(email)) {
                emailok=true;
                elusuario.setEmail(email);
            }else{
                emailok=false;
                
                System.out.println("\n"+email+"no es un email valido!!!");
                System.out.println("Ingrese nuevamente su email");
                email =  sc.nextLine();
            }
        }
        
        System.out.println("\nIngrese su usuario");
        elusuario.setUsuario(sc.nextLine());
        
        System.out.println("\nIngrese su contraseña (Minimo 8 caracteres)");
        boolean passok = false;
        String pass1 = sc.nextLine().toLowerCase();
        String pass2;
        while(passok == false){
            
            if (pass1.length()<=7) {
                    System.out.println("\nLa contraseña no cumple con los requisitos");
                    passok = false;
                    System.out.println("\nIngrese su contraseña");
                    pass1 = sc.nextLine().toLowerCase();
                    //System.out.println("error menos de 8");
            }else{
                    System.out.println("\nVuelva a ingresar su contraseña(Repetir)");
                    pass2= sc.nextLine().toLowerCase();
                    if (pass1.equals(pass2)) {
                        passok = true;
                        elusuario.setPassword(pass1);
                        System.out.println("Contraseña verificada!");
                    }
                    pass1="";
            }
                
        }      

        System.out.println("\nIngrese su Nombre: ");
        elusuario.setNombre(sc.nextLine());
        
        System.out.println("\nIngrese su apellido");
        elusuario.setApellido(sc.nextLine());
        
        System.out.println("\nIngrese su edad");
        elusuario.setEdad(sc.nextInt());
        
        System.out.println("\nIngrese su sexo");
        elusuario.setSexo(sc.next().toLowerCase());
        
        System.out.println("\nIngrese su dni");
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