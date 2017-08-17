/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.Modelo;

/**
 *
 * @author TheGuru
 */
public class Palabra {
        private String palabra;
        private boolean usada;

    public Palabra(String palabra, boolean usada) {
        this.palabra = palabra;
        this.usada = usada;
    }

        
        
        
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public boolean isUsada() {
        return usada;
    }

    public void setUsada(boolean usada) {
        this.usada = usada;
    }
                
}
