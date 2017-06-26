/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase25;

/**
 *
 * @author alumno
 */
public abstract class Perro implements IAritmetica{
    
    
    private int unPerroEntero;
    boolean descripcion;
    
    public Perro(){
        unPerroEntero = 1;
    }
    
    public Perro(int valor){
        unPerroEntero = valor;
    }

    public void Sumar(IAritmetica toAdd){
        System.out.println("Sumando Perros");
    }
    public void Restar(IAritmetica toAdd){
        System.out.println("Restando Perros");
    }
    public void Multiplicar(IAritmetica toAdd){
        System.out.println("Multiplicando Perros");
    }
    public void Dividir(IAritmetica toAdd){
        System.out.println("Dividiendo Perros");
    }
   // public Boolean EsIgualA(IAritmetica toAdd){
     //   return false;
    }
    
   // void Sumar(Perro otroPerro) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    //boolean descripcion() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
   
    
    
}
