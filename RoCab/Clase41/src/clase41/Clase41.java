/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* 1- Constructor privado
* 2- Metodo static para construir el objeto
* 3- Garantizar una unica instancia con una property privada static
* Patron de diseño Singleton
 */
package clase41;

/**
 *
 * @author alumno
 */
public class Clase41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conexionabd unaConexion = Conexionabd.getInstance();
        Conexionabd otraConexion = Conexionabd.getInstance();    
        
        System.out.println(unaConexion);
        System.out.println(otraConexion);
    }
    
}
