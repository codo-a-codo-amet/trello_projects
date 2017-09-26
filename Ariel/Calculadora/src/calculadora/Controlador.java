/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Event;
import java.awt.event.ActionEvent;

/**
 *
 * @author alumno
 */
public class Controlador {
    
    private String valorA;
    private String valorB;
    private String signo;
    protected ICalculadora conversor;
    protected VistaCalculadora vistaCalculadora;

    public Controlador() {

        vistaCalculadora = new VistaCalculadora();
        vistaCalculadora.setVisible(true);
    }

    public void Run() {
        //A partir de ahora, escucha lo que le sucede a la vista.
        vistaCalculadora.AddEventListener(this);

        // Lista de conversores
       // System.out.println("Lista de converors: " + ConversorFactory.GetConversorList());
        
       // ConversorComboBoxModel cbm = new ConversorComboBoxModel(ConversorFactory.GetConversorList());
        
        vistaCalculadora.getjComboBox3().setModel(cbm);
        

  

        /*
        conversor.setValeUnit(23.4f, "C");

        float conversion = conversor.convertToUnit("K");

        System.out.println("Valor convertido: " + conversion);    
         */
    }

    @Override
    public void listen(Event event) {

        System.out.println("Objecto dentro del evento: " + event.target.getClass().getCanonicalName());

        if (event.target.getClass().getCanonicalName().equalsIgnoreCase("java.awt.event.ActionEvent")) {
            ActionEvent ae = (ActionEvent) event.target;

            System.out.println("Se apreto boton desde controller" + ae.getActionCommand());
            
            /*
                if ae.getActionCommand equals "Converitr)
                   => aplicar la logica de conversion
                else
                    conversor = ConersorFactor.CrearConversor(ae.getActionCommand());

            */
            
            String valorAConvertirString = main_view.getjTextField2().getText();
            Double valorAConvertir = Double.parseDouble(valorAConvertirString);

            String unidadSeleccionada = (String) main_view.getjComboBox2().getModel().getSelectedItem();

            String unidadDestino = (String) main_view.getjComboBox1().getModel().getSelectedItem();
            float valorConvertido = 0.0f;
            System.out.println("Tengo el valor: " + valorAConvertir + " en la siguiente unidad: " + unidadSeleccionada);

            conversor.setValeUnit(valorAConvertir.floatValue(), unidadSeleccionada);

            valorConvertido = conversor.convertToUnit(unidadDestino);

            main_view.getjTextField1().setText("" + valorConvertido);
        } else {
            String nuevoConversor = (String) main_view.getjComboBox3().getModel().getSelectedItem();
            conversor = CalcuFactory.CreateCalculadora(nuevoConversor);
            
          
            
            
        }

    }
    
}
