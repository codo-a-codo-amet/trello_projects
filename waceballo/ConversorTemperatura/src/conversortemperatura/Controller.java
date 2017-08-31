package conversortemperatura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Controller {
    Principal unaVista;
    
    public Controller (){
        unaVista = new Principal();
        
    }
    
    public void Run(){
        unaVista.setVisible(true);
    }
    
    
}
