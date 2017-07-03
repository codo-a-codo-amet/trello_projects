/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opunarios;

/**
 *
 * @author alumno
 */
public class OpUnarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double precioProd=450.80 ;
    double porcDesc=0.10;
    boolean tieneDescuento=false;
    if (tieneDescuento==true)
    {
        double descuento=precioProd*porcDesc;
        double nuevoprecio=precioProd-descuento;
    System.out.println("El precio es " + nuevoprecio);
                            }
    else{
        System.out.println("No aplica descuento");
        }
    }
    
          
    }
        
       
    
    

