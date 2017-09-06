package conversordistancia;

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
    ConversorDistancia con;

    public Controller() {
        unaVista = new Principal();
        con = new ConversorDistancia();
    }

    public void Run() {
        //A partir de ahora, escucha lo que le sucede a la vista.
        unaVista.AddEventListener(this);

        unaVista.setVisible(true);
    }

    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent) event.target;

        if (ae.getActionCommand().equalsIgnoreCase("Salir")) {
            System.exit(0);
        }

        Integer unidadAConvertir = unaVista.getCbDesdeUnidad().getSelectedIndex();

        if (unidadAConvertir == 0) {
            JOptionPane.showMessageDialog(unaVista, "Debe seleccionar una opcion");
        } else {
            
            Double valorAconvertir = Double.parseDouble(unaVista.getTxtValorAConvertir().getText().replace(",", "."));
            Double v = con.ConvertirDistancia(unidadAConvertir, valorAconvertir);
            //System.out.println("valor convertido "+v);
            DecimalFormat df = new DecimalFormat("######.#####");

            unaVista.getTxtValorConvertido().setText(df.format(v));
            //unaVista.getTxtValorConvertido().setText(v.toString());
        }

    }

    
    
}