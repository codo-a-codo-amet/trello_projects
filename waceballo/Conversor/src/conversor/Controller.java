package conversor;

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

    Principal unaVista;
    IConversor con;

    public Controller() {
        unaVista = new Principal();
        //con = new ConversorEnergia();
    }

    public void Run() {

        ConversorComboBoxModel cb = new ConversorComboBoxModel(ConversorFactory.getListaConversores());
        unaVista.getCbConversores().setModel(cb);

        unaVista.getbtnConvertir().setEnabled(false);
//        System.out.println("Lista de conversores " + ConversorFactory.getListaConversores());
//
//        //1 - conversor Distancia
//        con = ConversorFactory.CrearConversor("Distancia");
//        System.out.println("Distancia " + con.Convertir(1, 10.0));
//        System.out.println("Lista de opciones " + con.getOpciones());
//
//        //2 - conversor Temperatura
//        con = ConversorFactory.CrearConversor("Temperatura");
//        System.out.println("Temperatura " + con.Convertir(1, 10.0));
//        System.out.println("Lista de opciones " + con.getOpciones());
//
//        //3 - conversor Peso
//        con = ConversorFactory.CrearConversor("Peso");
//        System.out.println("Peso " + con.Convertir(1, 10.0));
//        System.out.println("Lista de opciones " + con.getOpciones());
//
//        //4 - conversor Energia
//        con = ConversorFactory.CrearConversor("Energia");
//        System.out.println("Energia " + con.Convertir(1, 10.0));
//        System.out.println("Lista de opciones " + con.getOpciones());

        //A partir de ahora, escucha lo que le sucede a la vista.
        unaVista.AddEventListener(this);
        unaVista.setVisible(true);
    }

    @Override
    public void listen(Event event) {
        System.out.println("Objecto dentro del evento: " + event.target.getClass().getCanonicalName());

        if (event.target.getClass().getCanonicalName().equalsIgnoreCase("java.awt.event.ActionEvent")) {

            ActionEvent ae = (ActionEvent) event.target;
            System.out.println("print " + ae.getActionCommand());

            if (ae.getActionCommand().equalsIgnoreCase("Salir")) {
                System.exit(0);
            }

            Integer unidadAConvertir = unaVista.getCbDesdeUnidad().getSelectedIndex();

            if (unidadAConvertir == 0) {
                JOptionPane.showMessageDialog(unaVista, "Debe seleccionar una opcion");
            } else {
                Double valorAconvertir = Double.parseDouble(unaVista.getTxtValorAConvertir().getText().replace(",", "."));
                Double v = con.Convertir(unidadAConvertir, valorAconvertir);
                DecimalFormat df = new DecimalFormat("######.#####");

                unaVista.getTxtValorConvertido().setText(df.format(v));
            }

        } else {
            String nuevoConversor = (String) unaVista.getCbConversores().getModel().getSelectedItem();
            con = ConversorFactory.CrearConversor(nuevoConversor);

            //configurar combobox1
            ConversorComboBoxModel comboBox1Model = new ConversorComboBoxModel(con.getOpciones());
            unaVista.getCbDesdeUnidad().setModel(comboBox1Model);

            if (nuevoConversor.equalsIgnoreCase("Seleccione")) {
                unaVista.getbtnConvertir().setEnabled(false);
            } else {
                unaVista.getbtnConvertir().setEnabled(true);
            }

        }

    }

}
