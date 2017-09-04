package conversortemperatura;

import java.awt.Event;
import java.awt.event.ActionEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alumno
 */
public class Controller implements IViewEventListener {

    Principal unaVista;
    Conversor con;

    public Controller() {
        unaVista = new Principal();
        con = new Conversor();
    }

    public void Run() {
        //A partir de ahora, escucha lo que le sucede a la vista.
        unaVista.AddEventListener(this);

        unaVista.setVisible(true);
        System.out.println("Temperatura Convetira " + con.ConvertirTemperatura(6, 35));
    }

    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent) event.target;

        System.out.println("Se apreto boton desde controller " + ae.getActionCommand());

    }

}
