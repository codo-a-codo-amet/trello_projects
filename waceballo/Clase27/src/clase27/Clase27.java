/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Clase27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here    

        Complejo cine = new Complejo();

        System.out.println("Seleccione un Complejo");
        for (int i = 0; i < cine.getComplejos().size(); i++) {
            System.out.println(i+"-"+cine.getComplejos().get(i));
        }
        //System.out.println("0-Abasto; 1-Dot; 2-Village; 3-Cinemax; 4-Avellaneda");
        Integer opcionComplejo;
        Scanner teclado = new Scanner(System.in);
        opcionComplejo = Integer.parseInt(teclado.nextLine());

        if (opcionComplejo > cine.getComplejos().size() - 1) {
            System.out.println("No existe ese Complejo, vuelva a seleccionar...");
            opcionComplejo = Integer.parseInt(teclado.nextLine());
        }
        System.out.println("Complejo seleccionado: " + cine.getComplejos().get(opcionComplejo));

        System.out.println("Seleccione una Pelicula");
        
        System.out.println("yy "+cine.getListaDePeliculas());
        
        System.out.println("0-Mi Villano Favorito 3; 1-Mujer Maravilla; 2-La Momia; 3-Piratas del Caribe 5; 4-Solo se vive una vez");
        Integer opcionPelicula;
        opcionPelicula = Integer.parseInt(teclado.nextLine());
        System.out.println("Pelicula seleccionada: " + cine.getPelicula(opcionPelicula));

        System.out.println("Seleccione una Sala");
        System.out.println("0-Sala 1; 1-Sala 2; 2-Sala 3; 3-Sala 4; 4-Sala 5");
        Integer opcionSala;
        opcionSala = Integer.parseInt(teclado.nextLine());
        System.out.println("Sala seleccionada: "+cine.getSalas(opcionSala));

        System.out.println("Seleccione una Butaca");
        System.out.println("0-Asiento 1; 1-Asiento 2; 2-Asiento 3; 3-Asiento 4; 4-Asiento 5");
        Integer opcionButaca;
        opcionButaca = Integer.parseInt(teclado.nextLine());
        System.out.println("Butaca seleccionada: "+opcionButaca);

        System.out.println("");
        System.out.println("");
        
        System.out.println("Ud genero el siguiente Ticket");
        System.out.println("Complejo: "+cine.getComplejos().get(opcionComplejo));
        System.out.println("Pelicula seleccionada: " + cine.getPelicula(opcionPelicula));
        System.out.println("Sala seleccionada: "+cine.getSalas(opcionSala));
        System.out.println("Butaca seleccionada: "+opcionButaca);
        System.out.println("Desea confirmar la compra...");
        
        

    }

}
