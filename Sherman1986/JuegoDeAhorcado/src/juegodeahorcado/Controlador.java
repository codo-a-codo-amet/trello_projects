/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodeahorcado;

/**
 *
 * @author alumno
 */
public class Controlador {
    
    private Juego unJuego;

    public Controlador() {
        this.unJuego = new Juego();
    }
    
    public void Run() {
        unJuego.EjecutarJuego();
    }
}
