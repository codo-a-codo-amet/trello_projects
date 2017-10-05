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
        ActionEvent ae = (ActionEvent) event.target;
        System.out.println("Tecla "+ ae.getActionCommand());
        
        String tecla = ae.getActionCommand();
        String displayNumber = main_view.getjTextField2().getText();
        Integer number_length = displayNumber.length();
        
        // 
        // \d -> Reg expression que indica todo aquello que sea un string numerico
        if ( tecla.matches("\\d") ) {
            System.out.println("Es un numero");
            displayNumber = displayNumber + tecla;
            main_view.getjTextField2().setText(displayNumber);
            // get textfield y sumar string
        } else {
            if ( tecla.equals("C")){
                main_view.getjTextField2().setText("");
            } else if (tecla.equalsIgnoreCase("<X")  ) {
                main_view.getjTextField2().setText(displayNumber.substring(0, Integer.max(0, number_length-1) ));
            } else if (tecla.equals("+")) {
                
            } else if (tecla.equals("-")) {
                
            } else if (tecla.equals("x")) {
                
            } else if (tecla.equals("/")) {
                
            } else if (tecla.equals("=")) {
                
            }
        }
        
    }

}
