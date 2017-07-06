/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28;

/**
 *
 * @author alumno
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    private Integer dni;
    private String sexo;
    private Ropa calzado;
    private Ropa pantalones;
    private Ropa sombrero;
    private String religion;
    
    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        
        

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String toString(){
        return " Nombre= " + nombre + " Apellido = " + apellido;
    }

    public Persona(int edad) {
        this.edad = edad;
    }
    public Persona (){
        nombre ="N";
        apellido="N";
        edad=0;
        dni =0;
        sexo="Indefinido";
        calzado= new Ropa();
        calzado.talle="40";
        calzado.tipo=("Cuero");
        calzado.color=("Marron");
        calzado.marca=("Kickers");
        pantalones = new Ropa();
        pantalones.color=("Azul");
        pantalones.marca=("Levis");
        pantalones.talle=("41");
        pantalones.tipo=("Jean");
        sombrero = new Ropa();
        sombrero.color=("Gris");
        sombrero.tipo=("Bombin");
        sombrero.talle=("Medium");
        sombrero.marca=("Sin Marca");
    }
}
