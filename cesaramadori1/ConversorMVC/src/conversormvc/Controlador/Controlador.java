package conversormvc.Controlador;

import conversormvc.Modelo.Temperatura;
import conversormvc.Vista.IViewEventListener;
import conversormvc.Vista.Vista;
import java.awt.Event;
import java.awt.event.ActionEvent;


public class Controlador implements IViewEventListener {
    protected Vista calculadora;
    protected Conversor conversor;
    protected Temperatura inicial;

    public Controlador() {
        conversor = new Conversor();
        calculadora = new Vista();
        calculadora.setVisible(true);
        
    }
    
    public void Run(){
      calculadora.AddEventListener(this);
    }
    
    public void listen(Event event) {
        
        ActionEvent ae = (ActionEvent) event.target;
        
          System.out.println("Se apreto boton desde controller" +  ae.getActionCommand());
          
          
     }
    public void tempInicial(Double valor, int tipo){
        inicial = new Temperatura(valor,tipo);
    }
    public Double dameLaTemperatua(int tipo){
        Double valor = conversor.convertir(inicial.getValor(), inicial.getTipo(), tipo);
        return valor; 
    }
}
