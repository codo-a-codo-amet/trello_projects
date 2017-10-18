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
    String elnumero = "";
    @Override
    public void listen(Event event) {
        
        if (event.target.getClass().getCanonicalName().equalsIgnoreCase("java.awt.event.ActionEvent")) {
        ActionEvent ae = (ActionEvent) event.target;
        
        System.out.println("Tecla " + ae.getActionCommand());
        String numberOnDisplay = main_view.getjTextField2().getText();
        String numberOnLabel = main_view.getJLabel2().getText();
        String tecla = ae.getActionCommand();
        
        
        if(tecla.matches("\\d")){
            //System.out.println("Es un numero el "+ ae.getActionCommand());
            if (elnumero == ""){
               main_view.getjTextField2().setText("");
            }
            elnumero =  elnumero + ae.getActionCommand();
            System.out.println(elnumero);
            main_view.getjTextField2().setText(elnumero);
        }else if(tecla.equals("C")){
                main_view.getjTextField2().setText("0.0");
                elnumero= "";
                calculadora.definirElemento1(0.0);
                calculadora.definirElemento2(0.0);
                main_view.getjTextField2().setText("");
        }else if(tecla.equals("+")){
                calculadora.definirOperacion("+");
                if (calculadora.entregarElemento1()== 0) {
                    main_view.getJLabel2().setText(numberOnDisplay+" + ");
                    calculadora.definirElemento1(Double.parseDouble(numberOnDisplay));
                    main_view.getjTextField2().setText("0.0");
                    elnumero="";
                }else{
                   main_view.getJLabel2().setText(numberOnLabel + numberOnDisplay);
                   if(calculadora.entregarElemento2() ==0.0){
                       calculadora.definirElemento2(Double.parseDouble(numberOnDisplay));
                       main_view.getjTextField2().setText(calculadora.entregarResultado()+"");
                       calculadora.definirElemento1(calculadora.entregarResultado());
                       main_view.getjTextField2().setText("0.0");
                      elnumero="";
                        
                   }else{
                       main_view.getjTextField2().setText(calculadora.entregarResultado()+"");
                   }
                    
                    
                }
                
        }else if(tecla.equals("-")){
            calculadora.definirOperacion("-");
        }else if(tecla.equals("*")){
            calculadora.definirOperacion("*");
        }else if(tecla.equals("/")){ 
            calculadora.definirOperacion("/");
        }else if(tecla.equals("<|")){     
            main_view.getjTextField2().setText(numberOnDisplay.substring(0,Integer.max(0, numberOnDisplay.length()-1)));
        }else if(tecla.equals("=")){  
            if(calculadora.entregarElemento2() ==0.0){
                       calculadora.definirElemento2(Double.parseDouble(numberOnDisplay));
                       main_view.getJLabel2().setText(numberOnLabel + numberOnDisplay);
            main_view.getjTextField2().setText(String.valueOf(calculadora.entregarResultado()));
            elnumero="";
            }
        }else if(tecla.equals("CE")){      
           
                
        }
        
        
        }
        
    }
    
    public Controller (){
    main_view = new MainView();
    main_view.setVisible(true);
    }
    public void Run(){
        main_view.AddEventListener(this);
        calculadora = CalculatorFactory.CrearCalculadora("Simple");
        
        
        
      /*  //SUMA
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
    */}

}
