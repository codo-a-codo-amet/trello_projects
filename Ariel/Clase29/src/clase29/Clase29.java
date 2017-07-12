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
public class Clase29 {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i=0;
        int j=0;
        String arroba="@";
        
        System.out.println("Registrarse");
        
        while(i==1){
            Scanner unScaner = new Scanner(System.in);
          
        System.out.println("ingrese un correo");
        
        
        String uncorreo=unScaner.next();
       
            j = j+1;
            String letraPorLetra = uncorreo.substring(j,j);
            if(letraPorLetra != arroba){
                i=i+1;
              
            }
            else{
                System.out.println("El correo o es valido");
               
            } 
        
        }
        
        
        System.out.println("El correo es; ");
        
    }
    
}
