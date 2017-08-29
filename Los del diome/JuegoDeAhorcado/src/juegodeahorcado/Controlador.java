/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeahorcado;

import java.awt.Event;

/**
 *
 * @author alumno
 */
public class Controlador implements IKeyGameListener {

    protected AhorcadoVista unaVista;
    private Juego unJuego;

    public Controlador() {
        this.unJuego = new Juego();
        this.unaVista = new AhorcadoVista();
        unaVista.setVisible(true);
        
        this.unaVista.AddGameListeners(this);
    }

    public void Run() {
        unJuego.EjecutarJuego();
    }

    @Override
    public void listen(Event event) {
    }
}
