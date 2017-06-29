/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Complejo implements IComplejo {
    protected String nombre;
    protected String direccion;
    List <Sala> salas ;
    Iterator <Sala> iteradorSala;
                
    public Complejo(){
        nombre = "Hoyts Unicenter";
        direccion = "Paraná 3475 Unicenter Shopping";
        salas = new ArrayList();
        for (int i = 1; i < 10; i++) {
            salas.add(new Sala("Sala "+i));
        }
        Sala s;
    }

    @Override
    public String getComplejoNombre() {
        return nombre;
    }

    @Override
    public List<Pelicula> getListaDePeliculas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sala> getListaDeSalas() {     
       return salas;  
      }  

    @Override
    public List<Butacas> getListaButacasLibres(Sala paraEstaSala) {
        List <Butacas> lista_de_butacas = paraEstaSala.getAsientos();
        List <Butacas> listaAsientosLibres = new ArrayList();
        
        
        
        
        
        
        
        return paraEstaSala.asientos;
    }
    

    
}
