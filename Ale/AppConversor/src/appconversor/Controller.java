/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appconversor;

/**
 *
 * @author alumno
 */
public class Controller {
    
    protected Conversor conversor;
    protected MainView main_view;

    public Controller() {
        conversor = new Conversor();
        main_view = new MainView();
        main_view.setVisible(true);
    }
    
    public void Run() {
        conversor.setValeUnit(23.4f, "C");
        
        float conversion = conversor.convertToUnit("K");
        
        System.out.println("Valor convertido: " + conversion);
        
        
        
    }
    
}
