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
public class Mesa extends Mueble {
    private int cantPatas;

public Mesa (){
    cantPatas= 4;
    tipo="redonda";
}

    /**
     * @return the cantPatas
     */
    public int getCantPatas() {
        return cantPatas;
    }

    /**
     * @param cantPatas the cantPatas to set
     */
    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }
}