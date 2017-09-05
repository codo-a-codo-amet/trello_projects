/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordetemperatura;

import java.awt.Event;

/**
 *
 * @author alumno
 */
public class Controlador implements IViewEventListener{
     protected Conversor conversor;
    protected VistaConversor vistaConversor;
    
    public Controlador(){
        conversor = new Conversor();
        vistaConversor = new VistaConversor();
        vistaConversor.setVisible(true);
        
    }
    public  void Run() {
        vistaConversor.AddEventListener(this);
        
    }
      
    @Override
    public void listen(Event event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
