/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import modelo.Archivo;

/**
 *
 * @author wceba
 */
public class Juego {
    private String Palabra;
    
    Archivo archivo = new Archivo();
        
    private int getIdPalabra(int min, int max){
        return min + ( ( max - min) * (int)(Math.random()*1000)) / 1000;
    }
    
    public String MostrarPalabra(){
        int idPalabra = getIdPalabra(0, archivo.LeerArchivo().size());
    
        Palabra = archivo.LeerArchivo().get(idPalabra);
        
        return Palabra;
    }
    
    public Boolean BuscarLetra(String palabra, String letra){
        Boolean esta = null;
        
        for (int i = 0; i < palabra.length(); i++) {
            if (!palabra.equals(letra)){
                esta = Boolean.FALSE;
            }else{
                esta = Boolean.TRUE;
            }
        }        
        return esta;
    }
    
    
        

    
}
