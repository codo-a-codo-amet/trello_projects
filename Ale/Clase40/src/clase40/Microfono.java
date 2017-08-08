/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase40;

/**
 * Implementacion de patron de diseño
 * Singleton
 * @author alumno
 */
public class Microfono {
    
    private static Microfono instance = null;

    private Microfono() {
    }
    
    final public static Microfono getInstance() {
        if ( instance == null) {
             instance =  new Microfono();
        }
        return instance;
    }
    
}
