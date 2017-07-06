/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28;

import clase28.Nombre;

/**
 *
 * @author alumno
 */
public class Persona {
    
    protected String Nombre;
    protected String Apellido;
    protected int Dni;
    
    public Persona(){
     
        
    }

    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    protected Nombre string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public Nombre getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(Nombre string) {
        this.string = string;
    }

    public String getNombre() {
        return Nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + '}';
    }

    /**
     * Get the value of apllido
     *
     * @return the value of apllido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * Set the value of apllido
     *
     * @param apllido new value of apllido
     */
    public void setApellido(String apllido) {
        this.Apellido = apllido;
    }

    public String toString; 
    
    
}
