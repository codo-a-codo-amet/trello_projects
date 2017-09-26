package calculadora;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

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
    ICalculadora con;

    public Controller() {
        unaVista = new Vista();
        //con = new ConversorEnergia();
    }

    public void Run() {

        ConversorComboBoxModel cb = new ConversorComboBoxModel(CalculadoraFactory.getListaCalculadora());
        unaVista.getCbConversores().setModel(cb);

        unaVista.getbtnConvertir().setEnabled(false);
        unaVista.AddEventListener(this);
        unaVista.setVisible(true);
    }

    @Override
    public void listen(Event event) {
        if (event.target.getClass().getCanonicalName().equalsIgnoreCase("java.awt.event.ActionEvent")) {

            ActionEvent ae = (ActionEvent) event.target;

            if (ae.getActionCommand().equalsIgnoreCase("Salir")) {
                System.exit(0);
            }
            
            Integer unidadAConvertir = unaVista.getCbDesdeUnidad().getSelectedIndex();

            if (unidadAConvertir == 0) {
                JOptionPane.showMessageDialog(unaVista, "Debe seleccionar una opcion");
            } else {
                Double valorAconvertir = Double.parseDouble(unaVista.getTxtValorAConvertir().getText().replace(",", "."));
                DecimalFormat df = new DecimalFormat("######.#####");

            }

        } else {
            String nuevoConversor = (String) unaVista.getCbConversores().getModel().getSelectedItem();
            con = CalculadoraFactory.CrearCalculadora(nuevoConversor);

            //configurar combobox1
            ConversorComboBoxModel comboBox1Model = new ConversorComboBoxModel(con.getOpciones());
            unaVista.getCbDesdeUnidad().setModel(comboBox1Model);
            
            if (nuevoConversor.equalsIgnoreCase("Seleccione")){
                unaVista.getbtnConvertir().setEnabled(false);
            }else{
                unaVista.getbtnConvertir().setEnabled(true);
            }
            

        }

    }

}
