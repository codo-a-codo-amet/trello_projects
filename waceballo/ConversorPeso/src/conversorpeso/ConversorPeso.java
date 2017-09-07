/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this unidadlate file, choose Tools | Templates
 * and open the unidadlate in the editor.
 */
package conversorpeso;

/**
 *
 * @author alumno
 */
public class ConversorPeso {

    private Integer unidaderaturaAConvertir;
    private Integer unidaderaturaConvertida;
    private String tipoUnidadDestino;
    private String tipoUnidad;

    public Integer getTemperaturaAConvertir() {
        return unidaderaturaAConvertir;
    }

    public void setTemperaturaAConvertir(Integer unidaderaturaAConvertir) {
        this.unidaderaturaAConvertir = unidaderaturaAConvertir;
    }

    public Integer getTemperaturaConvertida() {
        return unidaderaturaConvertida;
    }

    public void setTemperaturaConvertida(Integer unidaderaturaConvertida) {
        this.unidaderaturaConvertida = unidaderaturaConvertida;
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
    public ConversorPeso() {
        //setTemperaturaConvertida(0);
    }

    /**
     * Metodo para convetir unidaderatura
     * recibe dos parametros
     * @param opcion es a se va a convetir
     * @param valor es el valor a convertir
     * y devuelve la unidaderatura convertida
     */    
    public double ConvertirDistancia(int opcion, Double valor) {
        double unidad;

        switch (opcion) {
            case 1://de yardas a km
                //1 yarda = 0.0009144 km
                unidad = (0.0009144 * valor);
                break;
            case 2://de yardas a millas
                //1 yarda = 0,000568182 milla
                unidad = (0.000568182 * valor);
                break;
            case 3://de km a yardas
                unidad = (1093.61 * valor);
                break;
            case 4://de km a millas
                unidad = (0.621371 * valor);
                break;
            case 5://de milla a yardas
                unidad = (1760 * valor);
                break;
            case 6://de milla a km
                unidad = (1.60934 * valor);
                break;
            default:
                unidad = 0.00;
                break;
        }
        return unidad;
    }

   
}
