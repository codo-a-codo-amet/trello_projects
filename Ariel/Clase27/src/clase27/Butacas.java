/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.List;

/**
 *
 * @author alumno
 */
public class Butacas implements IComplejo{
    protected String nombre;
    private String lugares;
        
    
    public Butacas (){
        
        nombre="butaca";
      
        
    }
    
    public Butacas (String lugares){
        this.lugares = lugares;
    }
    
    public String getLugares(){
        return lugares;
    }
    public void setLugares(String lugares){
        this.lugares = lugares;
    }
    
    public String toString(){
        return this.lugares+" ";
    }
        
    @Override
    public String getComplejoNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Peliculas> getListaDePeliculas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Salas> getListaDeSalas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Butacas> getListaButacasLibres(Salas paraEstaSala) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
