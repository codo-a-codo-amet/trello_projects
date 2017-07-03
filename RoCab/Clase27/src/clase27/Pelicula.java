/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;
/**
 *
 * @author alumno
 */
public class Pelicula extends Sala{
    private String titulo ="Matrix";
    private String genero ="Ciencia Ficcion";
    private int horario =22;
    private String breveDescripcion = "...";

    Pelicula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;     
    }
    
    public int getHorario(){
        return horario;
    }
    
    public void setHorario(int horario){
        this.horario = horario;
    }
    
    public String getBreveDescripcion(){
        return breveDescripcion;
    }
    
    public void setBreveDescripcion(String breveDescripcion){
        this.breveDescripcion = breveDescripcion;
    }
    
        public Pelicula(String titulo, String genero, int horario, String breveDescripcion) {
        this.titulo = titulo;
        this.genero = genero;
        this.horario = horario;
        this.breveDescripcion = breveDescripcion;
        }

}
