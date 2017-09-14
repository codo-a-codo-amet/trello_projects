/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconversor;

import java.awt.Event;
import java.awt.event.ActionEvent;

/**
 *
 * @author alumno
 */
public class Controller implements IViewEventListener{
    
    protected Conversor conversor;
    protected MainView main_view;

    public Controller() {
        conversor = new Conversor();
        main_view = new MainView();
        main_view.setVisible(true);
    }
    
    public void Run() {
        //A partir de ahora, escucha lo que le sucede a la vista.
        main_view.AddEventListener(this);
        
        conversor.setValeUnit(23.4f, "C");
        
        float conversion = conversor.convertToUnit("K");
        
        System.out.println("Valor convertido: " + conversion);        
    }

    @Override
    public void listen(Event event) {
        
        ActionEvent ae = (ActionEvent) event.target;
        
        System.out.println("Se apreto boton desde controller" +  ae.getActionCommand());
        
        
        String valorAConvertirString = main_view.getjTextField2().getText();
        Double valorAConvertir = Double.parseDouble(valorAConvertirString);
        
        String unidadSeleccionada = (String) main_view.getjComboBox2().getModel().getSelectedItem();
        
        System.out.println("Tengo el valor: " + valorAConvertir + " en la siguiente unidad: " + unidadSeleccionada);
        
        main_view.getjTextField1().setText("" + 2323.0f);
          
     }
    
}