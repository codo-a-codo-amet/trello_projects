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
    public double ConvertirPeso(int opcion, Double valor) {
        double unidad;

        switch (opcion) {
            case 1://de kilogramos a libras
                unidad = (2.20462 * valor);
                break;
            case 2://de kilogramos a onzas
                unidad = (35.274 * valor);
                break;
            case 3://de libras a kilogramos
                unidad = (0.453592 * valor);
                break;
            case 4://de libras a onzas
                unidad = (16 * valor);
                break;
            case 5://de onzas a kilogramos
                unidad = (0.0283495 * valor);
                break;
            case 6://de onzas a libras
                unidad = (0.0625 * valor);
                break;
            default:
                unidad = 0.00;
                break;
        }
        return unidad;
    }

   
}
