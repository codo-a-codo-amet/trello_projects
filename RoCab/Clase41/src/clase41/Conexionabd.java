/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase41;

/**
 *
 * @author alumno
 */
public class Conexionabd {
    
        private static Conexionabd instance = null;
    
    public Conexionabd() {
    }
 
    public static Conexionabd getInstance(){
        if (instance == null){
            instance =  new Conexionabd();
        }
        return instance;
    }    

    
}
