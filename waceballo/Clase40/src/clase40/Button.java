/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase40;

/**
 *
 * @author alumno
 */
public class Button extends Composite implements IView{
    private String nombre;
    private Integer orden;
    
    public Button(String nom, Integer ord){
        this.nombre = nom;
        this.orden = ord;
    }

    @Override
    public void Draw(String text) {
        
    }
    
}
