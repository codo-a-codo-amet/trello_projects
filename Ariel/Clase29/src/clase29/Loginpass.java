/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase29;

import java.util.*;
/**
 *
 * @author alumno
 */
public class Loginpass {
    
    private String nombre;
    private String apellido;
    private String usuario;
    private String correo;
    private String contraseña;
    int letrasCorreo;
    int i ;
    boolean j=false;
    String arroba;
    String letraPorLetra;
    boolean correoValido=false;
    
    public Loginpass(){
        nombre = "";
        apellido = "";
        usuario = "";
        correo = "";
        contraseña = "";
        arroba = "@";
        i=0;
        
        
        
    }
    
    
    
    public boolean IngreseCorreo(boolean correoVal){
        
        
        while (i == 1) {
             System.out.println("ingrese un correo");
        Scanner unScaner = new Scanner(System.in);
       
        String correo=unScaner.next();
        
    
        letrasCorreo=correo.length();
            
            letraPorLetra = correo.substring(i,i);
            if(letraPorLetra == arroba){
                i=i+1;
              
            }
            else{
                System.out.println("El correo o es valido");
            } 
        }
        
        return correoVal;
        
    }
    
    public String IngreseContraseña(String contraseñaVal){
        
        while(j==true){
            
            if(contraseña.length() >=8){
                System.out.println("Contraseña segura");
                
                j=true;
            }
            
            else{
                System.out.println("Escriba una contraseña que tenga un minimo de 8 caracteres");
            }
            
        }
        
        
        return contraseñaVal;
    }
    
    
}
