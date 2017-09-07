package conversormvc.Controlador;

import conversormvc.Vista.MainView;
import conversormvc.Modelo.Temperatura;
import conversormvc.Vista.IViewEventListener;
import conversormvc.Vista.Vista;
import java.awt.Event;
import java.awt.event.ActionEvent;


public class Controlador implements IViewEventListener {
    protected Vista calculadora;
    protected MainView main_view;
            
    protected ConversorPeso conversor;
    protected Temperatura inicial;

    public Controlador() {
        conversor = new ConversorPeso();
        //calculadora = new Vista();
        //calculadora.setVisible(true);
        main_view = new MainView();
        main_view.setVisible(true);
        
    }
    
    public void Run(){
      //calculadora.AddEventListener(this);
      main_view.AddEventListener(this);
    }
    
    public void listen(Event event) {
        
        ActionEvent ae = (ActionEvent) event.target;
        
          System.out.println("Se apreto boton desde controller" +  ae.getActionCommand());
        String valorAConvertirString = main_view.getjTextField2().getText();
        Double valorAConvertir = Double.parseDouble(valorAConvertirString);
        
        String unidadSeleccionada = (String) main_view.getjComboBox2().getModel().getSelectedItem();
        int unidadInicial=1;
        switch(unidadSeleccionada){
            case "K":
                unidadInicial=1;
                break;
            case "L":
                unidadInicial=2;
                break;
            case "O":
                unidadInicial=3;
                break;
        }
        String unidadDestino = (String) main_view.getjComboBox1().getModel().getSelectedItem();
        int unidadSalida=1;
        switch(unidadDestino){
            case "K":
                unidadSalida=1;
                break;
            case "L":
                unidadSalida=2;
                break;
            case "O":
                unidadSalida=3;
                break;
        }
        double valorConvertido = 0.0;
        System.out.println("Tengo el valor: " + valorAConvertir + " en la siguiente unidad: " + unidadSeleccionada);

        //conversor.setValeUnit(valorAConvertir.floatValue(), unidadSeleccionada);
        tempInicial(valorAConvertir, unidadInicial);
        //valorConvertido = conversor.convertToUnit(unidadDestino);
        valorConvertido = dameLaTemperatua(unidadSalida);

        main_view.getjTextField1().setText("" + valorConvertido);
          
     }
    public void tempInicial(Double valor, int tipo){
        inicial = new Temperatura(valor,tipo);
        System.out.println("Temp inicial "+ inicial.getValor()+" tipo "+ inicial.getTipo());
    }
    public Double dameLaTemperatua(int tipo){
        Double valor = conversor.convertir(inicial.getValor(), inicial.getTipo(), tipo);
        System.out.println("Temp final "+ valor+" tipo "+ tipo);
        return valor; 
    }
}
