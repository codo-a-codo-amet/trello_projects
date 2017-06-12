/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21;

/**
 *
 * @author alumno
 */
public class Clase21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo unVehiculo = new Vehiculo();
        Bicicleta mibici = new Bicicleta();
        Moto motito = new Moto();
        motito.setAño(2016);
        motito.setModelo("Ninja");
        motito.setMarca("Kawasaki");
        motito.setCombustible("Gasolina");
        motito.setRuedas(2);
        motito.Arrancar();
        motito.setPasajeros(2);
        System.out.println("La "+nombreDeObjeto(str)+" "+motito.getMarca()+" modelo "+motito.getModelo()+" es del año "+ motito.getAño());
        Lancha lanchita = new Lancha();
        System.out.println(unVehiculo.getMarca()+" "+unVehiculo.getModelo()+" "+unVehiculo.getAño()+" Esta detenido?"+ unVehiculo.Frenar());
        String objetoBici = nombreDeObjeto(mibici.getClass().getName().toString());
        nombreDeObjeto(objetoBici);
        //System.out.println(mibici.getClass().getName().toString());
        
        System.out.println("Tengo una "+nombreDeObjeto(objetoBici)+" marca "+mibici.marca+" del año "+mibici.anio);
    }
    
    public static String nombreDeObjeto(Object str){
        //System.out.println(str);
        //String[] parts= str.split(".");
        String nombre = str.getClass().getName().toString();
        System.out.println("");
        //int largo parts[].length();
        //System.out.println(parts[].length());
        //System.out.println(parts[1]);
        //String elNombre = parts[1];
  
        
        return nombre.substring(str.indexOf(".")+1, str.length());;
    }
}
