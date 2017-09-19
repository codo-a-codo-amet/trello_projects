package conversormvc.Controlador;

import conversormvc.Vista.MainView;
import conversormvc.Modelo.Temperatura;
import conversormvc.Vista.IViewEventListener;
import conversormvc.Vista.Vista;
import java.awt.Event;
import java.awt.event.ActionEvent;
import javax.swing.ComboBoxModel;

public class Controlador implements IViewEventListener {

    protected Vista calculadora;
    protected MainView main_view;

    protected IConversor conversor;
    protected Temperatura inicial;

    public Controlador() {
        main_view = new MainView();
        main_view.setVisible(true);

        

    }

    public void Run() {
        //calculadora.AddEventListener(this);
        main_view.AddEventListener(this);
        
        ConversorComboBoxModel conversorCombo = new ConversorComboBoxModel(ConversorFactory.getConversorList());
        main_view.getjComboBox3().setModel(conversorCombo);
      
        // A) Conversor de Distancia
        /* Tabla de valores 
    1 KM 
    2 Millas
    3 Yardas
         */
        conversor = ConversorFactory.CrearConvesor("Distancia");
        valorInicial(23.4, 1);
        Double resultado = dameElValorConvertido(2);
        System.out.println("23,4 Km son "+ resultado+ " millas.");
        System.out.println("Lista de Unidades " + conversor.getUnitList());
        
        //B) Conversor de Temperatura
        
        /* Tabla de valores 
    1 Celcius
    2 Kelvin
    3 Farenheit
    */
        conversor = ConversorFactory.CrearConvesor("Temperatura");
        valorInicial(39.00, 3);
        resultado = dameElValorConvertido(1);
        System.out.println("39.00 grados Farenheit son "+ resultado+ " grados Celcius.");
        System.out.println("Lista de Unidades " + conversor.getUnitList());
    }

    public void listen(Event event) {

        ActionEvent ae = (ActionEvent) event.target;

        System.out.println("Se apreto boton desde controller" + ae.getActionCommand());
        String valorAConvertirString = main_view.getjTextField2().getText();
        Double valorAConvertir = Double.parseDouble(valorAConvertirString);

        String unidadSeleccionada = (String) main_view.getjComboBox2().getModel().getSelectedItem();
        int unidadInicial = 1;
        switch (unidadSeleccionada) {
            case "K":
                unidadInicial = 1;
                break;
            case "C":
                unidadInicial = 2;
                break;
            case "J":
                unidadInicial = 3;
                break;
        }
        String unidadDestino = (String) main_view.getjComboBox1().getModel().getSelectedItem();
        int unidadSalida = 1;
        switch (unidadDestino) {
            case "K":
                unidadSalida = 1;
                break;
            case "C":
                unidadSalida = 2;
                break;
            case "J":
                unidadSalida = 3;
                break;
        }
        double valorConvertido = 0.0;
        System.out.println("Tengo el valor: " + valorAConvertir + " en la siguiente unidad: " + unidadSeleccionada);

        //conversor.setValeUnit(valorAConvertir.floatValue(), unidadSeleccionada);
        valorInicial(valorAConvertir, unidadInicial);
        //valorConvertido = conversor.convertToUnit(unidadDestino);
        valorConvertido = dameElValorConvertido(unidadSalida);

        main_view.getjTextField1().setText("" + valorConvertido);

    }

    public void valorInicial(Double valor, int tipo) {
        inicial = new Temperatura(valor, tipo);
        //System.out.println("Temp inicial " + inicial.getValor() + " tipo " + inicial.getTipo());
    }

    public Double dameElValorConvertido(int tipo) {
        Double valor = conversor.convertir(inicial.getValor(), inicial.getTipo(), tipo);
        //System.out.println("Temp final " + valor + " tipo " + tipo);
        return valor;
    }
}
