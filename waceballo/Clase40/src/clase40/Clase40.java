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
public class Clase40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Microfono unMicrofono = Microfono.getInstance();
        Microfono otroMicrofono = Microfono.getInstance();
        
        System.out.println(unMicrofono);
        System.out.println(otroMicrofono);
               
        ConexionBD con = ConexionBD.getInstance();
        ConexionBD con1 = ConexionBD.getInstance();

        System.out.println(con);
        System.out.println(con1);
        
        Vista vistaPrincipal = new Vista();
        
        for (int i = 0; i < 5; i++) {
            Button unBoton = new Button("nombre "+i+" orden ",+i);            
            vistaPrincipal.add(unBoton);
        }
        System.out.println(vistaPrincipal.component_list);
        
        Empleado unEmpleado = new Empleado();
        vistaPrincipal.add(unEmpleado);
        System.out.println(vistaPrincipal.component_list);
        
        vistaPrincipal unaNuevaVista = new vistaPrincipal();
        unaNuevaVista.setVisible(true);
        
    }
    
}

