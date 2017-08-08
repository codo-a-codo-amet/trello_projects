/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase40;

/**
 *
 * @author alumno
 */
public class ConexionBD {

   private static ConexionBD instance = null; 
    
    private ConexionBD() {
    
    }
    
    public static ConexionBD getInstance(){
        if (instance == null){
            instance =  new ConexionBD();
        }
        return instance;
    }      
    
    
}
