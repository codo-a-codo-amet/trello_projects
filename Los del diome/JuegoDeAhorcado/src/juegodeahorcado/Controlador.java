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
public class Controlador implements IKeyGameListener{
    
    protected AhorcadoVista unaVista;
    private Juego unJuego;

    public Controlador() {
        this.unJuego = new Juego();
        this.unaVista = new AhorcadoVista();
        unaVista.setVisible(true);
        
        unaVista.AddGameListener(this);
    }

    public void Run() {
        unJuego.EjecutarJuego();
    }

    @Override
    public void listen(Event event) {
        System.out.println("Controlador" + event);
    }

 
}
