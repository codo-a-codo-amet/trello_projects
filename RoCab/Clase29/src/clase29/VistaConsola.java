/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase29;

//import clase40.IView;

/**
 *
 * @author alumno
 */
public class VistaConsola implements IView{

    public void Draw(String textoAPintar){
        System.out.println(textoAPintar);
    }
    
    public void Draw() {
        
    }
    
    

    @Override
    public void Add() {
        System.out.println("Agregar a Pintado");;
    }

    @Override
    public void Clear() {
        System.out.println("Limpiar");;
    }
    
}
