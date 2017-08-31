package conversormvc.Controlador;

import conversormvc.Modelo.Temperatura;
import conversormvc.Vista.Vista;


public class Controlador {
    Vista calculadora;
    Conversor conversor;
    Temperatura inicial;

    public Controlador() {
        conversor = new Conversor();
        calculadora = new Vista();
        calculadora.setVisible(true);
        
    }
    public void tempInicial(Double valor, int tipo){
        inicial = new Temperatura(valor,tipo);
    }
    public Double dameLaTemperatua(int tipo){
        Double valor = conversor.convertir(inicial.getValor(), inicial.getTipo(), tipo);
        return valor; 
    }
}
