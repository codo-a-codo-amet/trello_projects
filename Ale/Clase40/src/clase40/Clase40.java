/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* 1- Contructor privadp
* 2- Metodo static para construir el objeto
* 3- Garantizar una unica instancia con una property privada static
SINGLETON 



 */
package clase40;

/**
 *
 * @author alumno
 */
public class Clase40 {
    
    static int lalal = 100;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Microfono unMicrofono = Microfono.getInstance();
        Microfono otroMicrofono = Microfono.getInstance();
        System.out.println(unMicrofono);
        System.out.println(otroMicrofono);
        

        Vista vistaPrincipal = new Vista();
        
        Button unBoton = new Button();
        
        vistaPrincipal.add(unBoton);
        
        Controlador unControlador = new Controlador(vistaPrincipal);
        
        HerbalLifeVendedor unVendedor = new HerbalLifeVendedor();
        HerbalLifeVendedor esclavoUno = new HerbalLifeVendedor();
        HerbalLifeVendedor esclavoDos = new HerbalLifeVendedor();
        
        HerbalLifeVendedor subEsclavoUno = new HerbalLifeVendedor();
        
        unVendedor.add(esclavoUno);
        unVendedor.add(esclavoDos);
        
        esclavoDos.add(subEsclavoUno);
                
        System.out.print(unVendedor);
        
    }
    
}
