package calculadora;

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

    Vista unaVista;
    ICalculadora unacalculadora;

    public Controller() {
        unaVista = new Vista();
    }

    public void Run() {

        ConversorComboBoxModel cb = new ConversorComboBoxModel(CalculadoraFactory.getListaCalculadora());
        unaVista.getCbConversores().setModel(cb);
        unaVista.setVisible(true);
        
        CalculadoraSimple calc = new CalculadoraSimple();

        calc.setOperacion("*");
        calc.setOperando1(10.0);
        calc.setOperando2(5.0);

        System.out.println("Resultado " + calc.Operaciones(calc.getOperando1(), calc.getOperacion(), calc.getOperando2()));

    }

    @Override
    public void listen(Event event) {

        
            ActionEvent ae = (ActionEvent) event.target;

            System.out.println("Se apreto boton desde controller " + ae.getActionCommand());

            System.out.println("Presione el boton: "+ae.getActionCommand());
            
            if (ae.getActionCommand().equalsIgnoreCase("Salir")) {
                System.exit(0);
            }
    }
    
}
