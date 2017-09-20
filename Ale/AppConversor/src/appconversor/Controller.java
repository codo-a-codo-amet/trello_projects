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
public class Controller implements IViewEventListener {

    protected IConversor conversor;
    protected MainView main_view;

    public Controller() {

        main_view = new MainView();
        main_view.setVisible(true);
    }

    public void Run() {
        //A partir de ahora, escucha lo que le sucede a la vista.
        main_view.AddEventListener(this);

        // Lista de conversores
        System.out.println("Lista de converors: " + ConversorFactory.GetConversorList());
        
        ConversorComboBoxModel cbm = new ConversorComboBoxModel(ConversorFactory.GetConversorList());
        
        main_view.getjComboBox3().setModel(cbm);
        

        // 1- Conversor de Distancia
        conversor = ConversorFactory.CreateConversor("Distancia");
        conversor.setValeUnit(23.4f, "km");
        float conversion = conversor.convertToUnit("millas");
        System.out.println("Valor convertido: " + conversion);
        System.out.println("Lista de unidades: " + conversor.getUnitList());

        // 2- Conversor de Masa
        conversor = ConversorFactory.CreateConversor("Masa");
        conversor.setValeUnit(83.4f, "kg");
        conversion = conversor.convertToUnit("pounds");
        System.out.println("Valor convertido: " + conversion);
        System.out.println("Lista de unidades: " + conversor.getUnitList());

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
            conversor = ConversorFactory.CreateConversor(nuevoConversor);
            
            //configurar combobox1
            ConversorComboBoxModel comboBox1Model = new ConversorComboBoxModel(conversor.getUnitList());
            main_view.getjComboBox1().setModel(comboBox1Model);
            
             //configurar combobox2
            ConversorComboBoxModel comboBox2Model = new ConversorComboBoxModel(conversor.getUnitList());
            main_view.getjComboBox2().setModel(comboBox2Model);
            
            
            
        }

    }

}
