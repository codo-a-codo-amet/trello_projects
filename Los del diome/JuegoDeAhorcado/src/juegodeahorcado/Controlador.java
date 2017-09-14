/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeahorcado;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alumno
 */
<<<<<<< HEAD
public class Controlador implements IKeyGameListener {
=======
public class Controlador implements IKeyGameListener{
>>>>>>> 2b34c2b5c87565731ffbf713f5b0be44dea818ce
    
    protected AhorcadoVista unaVista;
    private Juego unJuego;

    public Controlador() {
        this.unJuego = new Juego();
        this.unaVista = new AhorcadoVista();
        unaVista.setVisible(true);
<<<<<<< HEAD
 
=======
        
        unaVista.AddGameListeners(this);
>>>>>>> 2b34c2b5c87565731ffbf713f5b0be44dea818ce
    }

    public void Run() {
        while(! unJuego.TerminoElJuego()) {
            unaVista.getjLabel3().setText(unJuego.getMensaje());
        }
    }

    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent) event.target;
        String tecla = ae.getActionCommand();
        System.out.println("Tecla presionada" + tecla);
        unJuego.IngresarLetra(tecla);
    }

 
}
