
package consumo;

import javax.swing.JOptionPane;

public class AparatoElectrico {
 //Atributos
    private static double consumoTotal = 0;
    private final double potencia;
    private boolean encendido;
//Constructor
    public AparatoElectrico(double potencia) {
        this.potencia = potencia;
        encendido = false;
    }
//Metodos
    public static double getConsumo() {
        return consumoTotal;
    }
    
    public void enciende() {
        if (encendido==false) {
            encendido = true;
            consumoTotal += potencia;
        }
    }

    public void apaga() {
        if (encendido==true) {
            encendido = false;
            consumoTotal -= potencia;
        }
    }
    public static void imprimir(){
    JOptionPane.showMessageDialog(null, "El consumo electrico es " + AparatoElectrico.getConsumo(),"Consumo electrico",-1);
    
    }   
}
