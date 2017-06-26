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
public class Silla extends Mueble{
    private int cantPatas;
    private String modelo;    
    
    public Silla(){
        cantPatas = 4;
        modelo= "NewHouse";
        color="Haya";
        tipo="Reciclable";
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

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

