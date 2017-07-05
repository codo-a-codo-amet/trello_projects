/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;


import java.util.*;
import javax.swing.UIManager;


/**
 *
 * @author alumno
 */
public class Clase27 {
    
    public static void main(String[] args) {
        try {
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (Exception e) {
		e.printStackTrace();
	}
        IComplejo Hoyts = new Complejo();
        System.out.println("El nombre del complejo es " + Hoyts.getComplejoNombre());
        UI swing = new UI(Hoyts);
        swing.setVisible(true);
        
/*
        for (Iterator<Sala> iterator = Hoyts.getListaDeSalas().iterator(); iterator.hasNext();) {
            Sala unaSala = iterator.next();
            //System.out.println("En la "+ unaSala + " se proyecta " + unaSala.peli1.getNombre());
            System.out.println();
            Iterator<Butacas> iterator2 = Hoyts.getListaButacasLibres(unaSala).iterator();
            while (iterator2.hasNext()) {
                Butacas unaButaca = iterator2.next();
                System.out.println(unaButaca);
            }
        }
     */   
    }

   
    
}
