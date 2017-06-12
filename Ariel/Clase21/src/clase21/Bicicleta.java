/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21;

/**
 *
 * @author alumno
 */
public class Bicicleta extends Vehiculo implements IBicicleta {
    
    public Bicicleta(){
        
        marca = "Bianchi";
        ruedas = 2;
        pasajeros = 1;
           
     }
    
    public String MontarBici(){
        return "Se ha montado la bici";
        
    }
    public String AvanzarBici(){
        return "Se esta manejando la bici";
    }
    
    public String FrenarBici(){
        return "Activando frenos en la bici";
    }
    
    
    
}
