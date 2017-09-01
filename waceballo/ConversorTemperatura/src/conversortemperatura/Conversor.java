/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversortemperatura;

/**
 *
 * @author alumno
 */
public class Conversor {
    private Integer temperaturaAConvertir;
    private Integer temperaturaConvertida;
    private String tipoUnidadDestino;
    private String tipoUnidad;
    
    public Integer getTemperaturaAConvertir() {
        return temperaturaAConvertir;
    }

    public void setTemperaturaAConvertir(Integer temperaturaAConvertir) {
        this.temperaturaAConvertir = temperaturaAConvertir;
    }

    public Integer getTemperaturaConvertida() {
        return temperaturaConvertida;
    }

    public void setTemperaturaConvertida(Integer temperaturaConvertida) {
        this.temperaturaConvertida = temperaturaConvertida;
    }

    public String getTipoUnidadDestino() {
        return tipoUnidadDestino;
    }

    public void setTipoUnidadDestino(String tipoUnidadDestino) {
        this.tipoUnidadDestino = tipoUnidadDestino;
    }

    public String getTipoUnidad() {
        return tipoUnidad;
    }

    public void setTipoUnidad(String tipoUnidad) {
        this.tipoUnidad = tipoUnidad;
    }

    //constructor de la clase
    public Conversor(){
        setTemperaturaConvertida(0);
    }
    
    public int ConvertirTemperatura(){
if(!setTipoUnidad("C")){
    
}
        switch (setTipoUnidad(tipoUnidad)) {

                case valor1:
                instrucciones;
                break;

                case valor2:
                instrucciones;
                break;
                .
                .
                .
                default:
                sentencias;
                break;
                
            } 
return getTemperaturaConvertida();


 } 
    

        
//        if (getTipoUnidadDestino().equals("F")){
//            if (getTipoUnidad().equals("C")){
//                setTemperaturaConvertida((getTemperaturaAConvertir() * 9 / 5) + 32);
//            }
//            
//            
//        }
        

    



   
}
