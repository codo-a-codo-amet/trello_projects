package conversortemperatura;

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
    Conversor con;
<<<<<<< HEAD
    
    public Controller (){
=======

    public Controller() {
>>>>>>> 5b7939faa19cf1c45670772961056ea69a525aaa
        unaVista = new Principal();
        con = new Conversor();
    }

    public void Run() {
        //A partir de ahora, escucha lo que le sucede a la vista.
        unaVista.AddEventListener(this);

        unaVista.setVisible(true);
        System.out.println("temperatura convetira "+con.ConvertirTemperatura(2,10));
    }

    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent) event.target;

        if (ae.getActionCommand().equalsIgnoreCase("Salir")) {
            //System.out.println("Se apreto boton desde controller " + ae.getActionCommand());
            //unaVista.setVisible(false);
            System.exit(0);
        }

        Integer unidadAConvertir = unaVista.getCbDesdeUnidad().getSelectedIndex();

        if (unidadAConvertir == 0) {
            //System.out.println("Se apreto boton desde controller " + ae.getActionCommand());
            JOptionPane.showMessageDialog(unaVista, "Debe seleccionar una opcion");
        } else {
            
            Double valorAconvertir = Double.parseDouble(unaVista.getTxtValorAConvertir().getText().replace(",", "."));
            Double v = con.ConvertirTemperatura(unidadAConvertir, valorAconvertir);
            DecimalFormat df = new DecimalFormat("#.00");

            unaVista.getTxtValorConvertido().setText(df.format(v));
            //System.out.println(valorAconvertir + " - "+unidadAConvertir);
            //System.out.println("Temperatura Convetira " + con.ConvertirTemperatura(unidadAConvertir, valorAconvertir));         
        }

    }

}
