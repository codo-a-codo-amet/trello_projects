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
    protected Integer ruedas;
    protected String tipoMotor;
    private String combustible;
    protected String marca;
    protected String modelo;
    private Integer año;
    protected String patente;
    
   
    
    
    public Vehiculo(){
        pasajeros = 4;
        ruedas = 4;
        tipoMotor = "Ferrari";
        combustible = "Magico";
        marca = "Ferrari";
        modelo = "Ferrari Classic";
        año = 2017;
        patente = "ZZZ 000";
    }
    
    public boolean Frenar(){
        return true;
    }
    
   public Integer obtenerPasajeros(){
        return pasajeros;
    }
   public Integer obtenerRuedas(){
       return ruedas;
   }
   public String obtenerMotor(){
       return tipoMotor;
   }
   public String obtenerCombustible(){
        return combustible;
    }
    public String obtenerMarca() {
        return marca;
    }

    public String obtenerModelo(){
        return modelo;
    }
    public Integer obtenerAño(){
        return año;
    }
    public String obtenerPatente(){
        return patente;
    }
    public void Moverse (int km){
        System.out.println("El auto se movio " + km);
    }

    @Override
    public boolean Arrancar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}