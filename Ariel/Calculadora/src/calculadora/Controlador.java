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
public class Controlador implements IViewEventListener{
    
    private String valorA;
    private String valorB;
    private String signo;
    private String laPantalla;
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
        
     
    }

   
    public void listen(Event event) {
        
        System.out.println("Objecto dentro del evento: " + event.target.getClass().getCanonicalName());
        ActionEvent ae = (ActionEvent) event.target;
        laPantalla = vistaCalculadora.getjPantalla().getText();
        if(laPantalla.equals("")){
            vistaCalculadora.getjPantalla().setText(ae.getActionCommand().toString());
        }else{
            vistaCalculadora.getjPantalla().setText(vistaCalculadora.getjPantalla().getText()+ae.getActionCommand().toString());
        }
        
        if (event.target.getClass().getCanonicalName().equalsIgnoreCase("java.awt.event.ActionEvent")) {
           

            System.out.println("Se apreto boton desde controller" + ae.getActionCommand());
         }
        CalcuSimple operacion = new CalcuSimple();
        laPantalla= operacion.getOperaciones("12", "10", "+","");
        
        System.out.println("El resultado es "+laPantalla);
    
}
}