/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import View.IViewEventListener;
import View.MainView;
import java.awt.Event;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Controller implements IViewEventListener {
    protected ICalculator calculadora; 
    MainView main_view;
    @Override
    public void listen(Event event) {
        
        if (event.target.getClass().getCanonicalName().equalsIgnoreCase("java.awt.event.ActionEvent")) {
        ActionEvent ae = (ActionEvent) event.target;
        
        System.out.println("Tecla " + ae.getActionCommand());
        
        
        
        }
        
    }
    
    public Controller (){
    main_view = new MainView();
    main_view.setVisible(true);
    }
    public void Run(){
        main_view.AddEventListener(this);
        
        
        
        
        //SUMA
        calculadora = CalculatorFactory.CrearCalculadora("Simple");
        calculadora.definirElemento1(1.5);
        calculadora.definirOperacion("+");
        calculadora.definirElemento2(3.5);
        System.out.println("1.5+3.5");
        System.out.println("Resultado "+calculadora.entregarResultado());
        
        //RESTA
        calculadora = CalculatorFactory.CrearCalculadora("Simple");
        calculadora.definirElemento1(1.5);
        calculadora.definirOperacion("-");
        calculadora.definirElemento2(3.5);
        System.out.println("1.5-3.5");
        System.out.println("Resultado "+calculadora.entregarResultado());
        
        //MULTIPLICACION
        calculadora = CalculatorFactory.CrearCalculadora("Simple");
        calculadora.definirElemento1(1.5);
        calculadora.definirOperacion("*");
        calculadora.definirElemento2(3.5);
        System.out.println("1.5*3.5");
        System.out.println("Resultado "+calculadora.entregarResultado());
        
        //DIVISION
        calculadora = CalculatorFactory.CrearCalculadora("Simple");
        calculadora.definirElemento1(1.5);
        calculadora.definirOperacion("/");
        calculadora.definirElemento2(3.5);
        System.out.println("1.5/3.5");
        System.out.println("Resultado "+calculadora.entregarResultado());
    }

}
