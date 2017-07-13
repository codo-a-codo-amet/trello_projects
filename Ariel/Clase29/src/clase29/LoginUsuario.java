/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase29;
import java.util.*;
/**
 *
 * @author Kyoz
 */
public class LoginUsuario {
    
    protected IView otraVista;
    private String nombre;
    private String correo;
    private String usuario;
    private String contraseña;
    String arroba="@";
    String buscarArroba="";
    int a = 0;
    int i = 0;
    String laletra = "";
    private int buenaContraseña=0;
    public LoginUsuario(){
        
    }
    public LoginUsuario(String correo, String usuario, String contraseña,int buenaContraseña,IView otraVista) {
    this.correo=correo;
    this.usuario=usuario;
    this.contraseña=contraseña;
    this.buenaContraseña = buenaContraseña;
   
           this.otraVista = otraVista;
    }
    
    public void UsuarioValido(){
        Scanner unScanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre de usuario;");
        usuario = unScanner.next();
        
         
        
            
        
    }
   

        public void ContraseñaValida(){           
            Scanner unScanner = new Scanner(System.in);
            otraVista.Draw("Ingrese una contraseña");
            contraseña = unScanner.next();
            System.out.println("el numero de letras es "+contraseña.length());
            
          do{ 
            if (contraseña.length()>8) {
            System.out.println("Buena contraseña");
           buenaContraseña = buenaContraseña+1;
              
            
        }
        else{
            System.out.println("La contraseña debe tener minimo 8 caracteres ");
                System.out.println("Ingrese una contraseña");
            contraseña = unScanner.next();
            }
          }
          while (buenaContraseña == 0);
        }
        
        
        public int getBuenaContraseña(){
            return buenaContraseña;
        }
        
    
    public void CorreoValido(){
       Scanner unScanner = new Scanner(System.in);
              
        System.out.println("Ingrese un correo; ");
        correo = unScanner.next();
        i=0;
        
        do{
            for (int i = 0; i < correo.length(); i++) {
                laletra = correo.substring(i,i+1);
            
                if(laletra.equals(arroba)){
                a=a+1;
                }
            }   
            
            
            if(a < 1){
                System.out.println("Correo no valido, intente nuevamente; ");
                correo = unScanner.next();
            }
            else{
                System.out.println("Su correo se registro con exito");
            }
          
            
        }while(a==0);
    }
       
        
        
}
    

