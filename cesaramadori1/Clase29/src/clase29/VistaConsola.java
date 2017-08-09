/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase29;

/**
 *
 * @author alumno
 */
class VistaConsola implements IVista {
    
    Controlador controlador;
    @Override
    public void Mostrar() {
        
        
    }


    @Override
    public void AgregarMuestra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Mostar(String textoAMostrar) {
        System.out.println(textoAMostrar);
    }
    
}
