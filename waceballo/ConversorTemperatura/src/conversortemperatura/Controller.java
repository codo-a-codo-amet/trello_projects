package conversortemperatura;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

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

    public Controller() {
        unaVista = new Principal();
        con = new Conversor();
    }

    public void Run() {
        //A partir de ahora, escucha lo que le sucede a la vista.
        unaVista.AddEventListener(this);

        unaVista.setVisible(true);
    }

    @Override
    public void listen(Event event) {
        ActionEvent ae = (ActionEvent) event.target;

        //System.out.println("Se apreto boton desde controller " + ae.getActionCommand());
        
        Integer valorAconvertir = Integer.parseInt(unaVista.getTxtValorAConvertir().getText());
        Integer unidadAConvertir = unaVista.getCbDesdeUnidad().getSelectedIndex();

        //System.out.println("Temperatura Convetira " + con.ConvertirTemperatura(unidadAConvertir, valorAconvertir));
        
        Double v = con.ConvertirTemperatura(unidadAConvertir, valorAconvertir);
        DecimalFormat df = new DecimalFormat("#.00");
                
        unaVista.getTxtValorConvertido().setText(df.format(v));
        //System.out.println(valorAconvertir + " - "+unidadAConvertir);
        
    }

}
