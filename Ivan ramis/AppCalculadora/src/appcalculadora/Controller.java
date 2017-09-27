/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcalculadora;

import appcalculadora.calculadoras.ICalculadora;
import appcalculadora.calculadoras.CalculadoraFactory;
import java.awt.Event;
import java.awt.event.ActionEvent;

/**
 *
 * @author alumno
 */
public class Controller implements IViewEventListener {

    protected ICalculadora calculadora;
    protected MainView main_view;

    public Controller() {
        main_view = new MainView();
        main_view.setVisible(true);
    }

    public void Run() {
        //A partir de ahora, escucha lo que le sucede a la vista.
        main_view.AddEventListener(this);

        calculadora = CalculadoraFactory.CreateConversor("Simple");
        
        //1- Suma
        float element1 = (float)Math.random() * 10.0f;
        float element2 = (float)Math.random() * 10.0f;
        String operation = "+";
        float result = calculadora.binaryOperation(element1, operation, element2);
        
        System.out.println("Calcladora probando operacion: " + operation +
                " Elementos(1) "+ element1 + 
                " (2) " + element2 + 
                " resultado: " +  result);
       
        //2- Suma
        element1 = (float)Math.random() * 10.0f;
        element2 = (float)Math.random() * 10.0f;
        operation = "-";
        result = calculadora.binaryOperation(element1, operation, element2);
        
        System.out.println("Calcladora probando operacion: " + operation +
                " Elementos(1) "+ element1 + 
                " (2) " + element2 + 
                " resultado: " +  result);

    }

    @Override
    public void listen(Event event) {

      
    }

}
