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
    
    private Integer pasajeros;
    protected Integer ruedas;
    private String tipoMotor;
    protected String combustible;
    protected String marca;
    protected String modelo;
    protected Integer anio;
    protected String patente;
    
    public Vehiculo(){
        pasajeros=2;
        ruedas=4;
        tipoMotor="Borgward";
        combustible="Gasoil";
        marca="I.A.M.E.";
        modelo="Rastrojero";
        anio =1954;
        patente="RJE123";
        
        
    }
    
    public boolean Frenar(){
        return true;
    }

    @Override
    public boolean Arrancar() {
       return true;
    }

    @Override
    public String Moverse() {
        return "Me estoy moviendo";
    }

    /**
     * @return the pasajeros
     */
    public Integer getPasajeros() {
        return pasajeros;
    }

    /**
     * @param pasajeros the pasajeros to set
     */
    public void setPasajeros(Integer pasajeros) {
        this.pasajeros = pasajeros;
    }

    /**
     * @return the ruedas
     */
    public Integer getRuedas() {
        return ruedas;
    }

    /**
     * @param ruedas the ruedas to set
     */
    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }

    /**
     * @return the tipoMotor
     */
    public String getTipoMotor() {
        return tipoMotor;
    }

    /**
     * @param tipoMotor the tipoMotor to set
     */
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    /**
     * @return the combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the año
     */
    public Integer getAño() {
        return anio;
    }

    /**
     * @param año the año to set
     */
    public void setAño(Integer año) {
        this.anio = año;
    }

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }
            
}
