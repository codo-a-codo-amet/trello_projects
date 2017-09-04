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
    Conversor con;
    
    public Controller (){
        unaVista = new Principal();
        con = new Conversor();
    }
    
    public void Run(){
        unaVista.setVisible(true);
        System.out.println("Temperatura Convetira "+con.ConvertirTemperatura(6,35));
    }
    
    
}
