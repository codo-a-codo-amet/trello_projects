/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this unidadlate file, choose Tools | Templates
 * and open the unidadlate in the editor.
 */
package conversorenergia;

/**
 *
 * @author alumno
 */
public class ConversorEnergia {

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
    public ConversorEnergia() {
        //setTemperaturaConvertida(0);
    }

    /**
     * Metodo para convetir unidaderatura
     * recibe dos parametros
     * @param opcion es a se va a convetir
     * @param valor es el valor a convertir
     * y devuelve la unidaderatura convertida
     */    
    public double ConvertirEnergia(int opcion, Double valor) {
        double unidad;

        switch (opcion) {
            case 1://de kWh a Calorias
                unidad = (860.421 * valor);
                break;
            case 2://de kWh a Julio
                unidad = (3.6e+6 * valor);
                break;
            case 3://de Calorias a kWh
                unidad = (0.00116222 * valor);
                break;
            case 4://de Calorias a Julio
                unidad = (4184 * valor);
                break;
            case 5://de Julio a kWh
                unidad = (2.7778e-7 * valor);
                break;
            case 6://de Julio a Calorias
                unidad = (0.000239006 * valor);
                break;
            default:
                unidad = 0.00;
                break;
        }
        return unidad;
    }

   
}
