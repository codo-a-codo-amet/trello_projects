/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21;

/**
 *
 * @author alumno
 */
public class Vehiculo implements IVehiculo {

    protected Integer pasajeros;
    private Integer ruedas;
    private String tipoMotor;
    private String combustible;
    private String marca;
    private String modelo;
    private Integer año;
    private String patente;

    public Vehiculo() {
        pasajeros = 0;
        ruedas = 0;
        tipoMotor = "Definir";
        combustible = "Definir";
        marca = "Definir";
        modelo = "Definir";
        año = 0;
        patente = "Definir";
    }

    public Integer getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int cant_pasajeros) {
        pasajeros = cant_pasajeros;
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public void setRuedas(Integer cant_ruedas) {
        ruedas = cant_ruedas;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipomotor) {
        tipoMotor = tipomotor;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String Combustible) {
        combustible = Combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        modelo = Modelo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer anio) {
        año = anio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String Patente) {
        patente = Patente;
    }

    public void Moverse(int km) {
        if (km > 0) {
            Arrancar();
            System.out.println("Tiene que avanzar " + km + " km");
        } else {
            Frenar();
            System.out.println("Esta detenido ...");
        }
    }

    public boolean Arrancar() {
        return true;
    }

    public boolean Frenar() {
        return true;
    }

}
