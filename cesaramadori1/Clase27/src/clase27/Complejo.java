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
    protected int cantida_de_salas = 10;
    List <Sala> salas ;
    Iterator <Sala> iteradorSala;
    Pelicula laPelicula;
    String listado_de_Peliculas[] = new String[]{"E.T., el extraterrestre (1982)",
            "Volver al futuro (1985)", "Tiburon (1975)", "Cortocircuito (1986)","Gremlins (1984)",
            "StarWars - Una nueva esperanza (1977)", "IT (1990)", "Martes 13 (1980)", "Critters - Ojo, Muerden (1986)", "Chucky - Muñeco Diabólico (1988)"};
                
    public Complejo(){
        nombre = "Hoyts Unicenter";
        direccion = "Paraná 3475 Unicenter Shopping";
        salas = new ArrayList();
        for (int i = 0,a=1; i < cantida_de_salas; i++) {
            Pelicula estaPeli = new Pelicula(listado_de_Peliculas[i]);
            salas.add(new Sala("Sala "+ a, estaPeli ));
            a++;
        }
        
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
        
        for (Iterator<Butacas> iterator = lista_de_butacas.iterator(); iterator.hasNext();) {
            Butacas unaButaca = iterator.next();
            if (!unaButaca.isOcupada()) {
                listaAsientosLibres.add(unaButaca);
            }
        }
        
        
        
        
        
        return listaAsientosLibres;
    }
    

    
}
