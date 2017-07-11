/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase24;

/**
 *
 * @author alumno
 */
public class Laptop extends Mueble {
    protected String marca;
    
    private void inicializar(){
        material = "Titanium";
        forma = "Portatil";
        color = "Negra";
        tamanio = "15 pulgadas";
        tipo = "Notebook";
    }
    
    public Laptop() {
       inicializar();
    }
    
    public Laptop(String Marca) {
        inicializar();
        marca = Marca;
    }
    
    public String dameTuMarca(){
        return marca;
    }
    
}
