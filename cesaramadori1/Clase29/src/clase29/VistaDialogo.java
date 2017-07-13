/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase29;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class VistaDialogo implements IVista {
    public void Mostrar(){
        
    }
    
    public void Mostar(String textoAMostrar){
        JOptionPane.showInputDialog(null, textoAMostrar);
    }
    
    public void AgregarMuestra(){
        
    }
    
    public void Limpiar(){
        
    }
}
