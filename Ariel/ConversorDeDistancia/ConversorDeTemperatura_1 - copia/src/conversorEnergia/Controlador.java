/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorEnergia;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author alumno
 */
public class Controlador implements IViewEventListener{
     protected Conversor conversor;
    protected VistaConversor vistaConversor;
    
    public Controlador(){
        conversor = new Conversor();
        vistaConversor = new VistaConversor();
        
         
        vistaConversor.setVisible(true);
        
    }
    public  void Run() {
        vistaConversor.AddEventListener(this);
        
        System.out.println("Arranco el programa");
    }
      
    @Override
    public void listen(Event event) {
         ActionEvent ae = (ActionEvent) event.target;
        
        System.out.println("Se apreto boton desde controller" +  ae.getActionCommand());
        
          Conversor temperatura = new Conversor();
        int seleccionado1;
        int seleccionado2;
        seleccionado1 =  vistaConversor.getjSelecBox1().getSelectedIndex();
       
        seleccionado2 = vistaConversor.getjSelecBox2().getSelectedIndex();
        if(seleccionado1 == 0){
           
                if (seleccionado2 == 0) {
                    vistaConversor.getJpantallaB().setText(vistaConversor.getJpantallaA().getText());
               
                }else if (seleccionado2 == 1) {
                    vistaConversor.getJpantallaB().setText(temperatura.getCelsiusConvertir(vistaConversor.getJpantallaA().getText(), 1));
                }else if (seleccionado2 == 2) {
                    vistaConversor.getJpantallaB().setText(temperatura.getCelsiusConvertir(vistaConversor.getJpantallaA().getText(), 2));
                }
                
        }else if(seleccionado1 ==1){
                if (seleccionado2 == 0){
                    vistaConversor.getJpantallaB().setText(temperatura.getKelvinconvertir(vistaConversor.getJpantallaA().getText(), 1));
                }else if (seleccionado2 == 1){
                    vistaConversor.getJpantallaB().setText(vistaConversor.getJpantallaA().getText());
                }else if(seleccionado2 == 2){
                    vistaConversor.getJpantallaB().setText(temperatura.getKelvinconvertir(vistaConversor.getJpantallaA().getText(), 2));
                }
                
        }else if(seleccionado1 ==2){
                if (seleccionado2 == 0) {
                    vistaConversor.getJpantallaB().setText(temperatura.getFarengeiConvertir(vistaConversor.getJpantallaA().getText(), 1));
                }else if (seleccionado2 == 1) {
                     vistaConversor.getJpantallaB().setText(temperatura.getFarengeiConvertir(vistaConversor.getJpantallaA().getText(), 2));
                }else if (seleccionado2 == 2) {
                    vistaConversor.getJpantallaB().setText(vistaConversor.getJpantallaA().getText());
                }
    }
    }

    
}
