/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontemperatura;

/**
 *
 * @author alumno
 */
public class Controlador {
    protected Vista unaVista;
    private Conversor unConversor;

    public Controlador() {
        this.unConversor = new Conversor();
        this.unaVista = new Vista();
        unaVista.setVisible(true);
        
    }

    public void Run() {
        unConversor.EjecutarConversor();
    }
}
