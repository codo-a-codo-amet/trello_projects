/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase30;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Controlador {
    protected IView unaVista;

   
    public Controlador(IView unaVista){
        this.unaVista = unaVista;
    }

    
    public void run(){        
        IComplejo hoytsAbasto = new Complejo();

        unaVista.Draw(hoytsAbasto.getComplejoNombre());

        IComplejo hoytDot = new Complejo();
        unaVista.Draw(hoytDot.getComplejoNombre());

        Complejo cine = new Complejo();

        unaVista.Draw("Seleccione un Complejo");
        unaVista.Draw("0-Abasto; 1-Dot; 2-Village; 3-Cinemax; 4-Avellaneda");
        Integer opcionComplejo;
        Scanner teclado = new Scanner(System.in);
        opcionComplejo = Integer.parseInt(teclado.nextLine());

        if (opcionComplejo > cine.getComplejos().size() - 1) {
            unaVista.Draw("No existe ese Complejo, vuelva a seleccionar...");
            opcionComplejo = Integer.parseInt(teclado.nextLine());
        }
        unaVista.Draw("Complejo seleccionado: " + cine.getComplejos().get(opcionComplejo));

        unaVista.Draw("Seleccione una Pelicula");
        unaVista.Draw("0-Mi Villano Favorito 3; 1-Mujer Maravilla; 2-La Momia; 3-Piratas del Caribe 5; 4-Solo se vive una vez");
        Integer opcionPelicula;
        opcionPelicula = Integer.parseInt(teclado.nextLine());
        unaVista.Draw("Pelicula seleccionada: " + cine.getPelicula(opcionPelicula));

        unaVista.Draw("Seleccione una Sala");
        unaVista.Draw("0-Sala 1; 1-Sala 2; 2-Sala 3; 3-Sala 4; 4-Sala 5");
        Integer opcionSala;
        opcionSala = Integer.parseInt(teclado.nextLine());
        unaVista.Draw("Sala seleccionada: "+cine.getSala(opcionSala));

        unaVista.Draw("Seleccione una Butaca");
        unaVista.Draw("0-Asiento 1; 1-Asiento 2; 2-Asiento 3; 3-Asiento 4; 4-Asiento 5");
        Integer opcionButaca;
        opcionButaca = Integer.parseInt(teclado.nextLine());
        unaVista.Draw("Butaca seleccionada: "+opcionButaca);

        unaVista.Draw("");
        unaVista.Draw("");
        
        unaVista.Draw("Ud genero el siguiente Ticket");
        unaVista.Draw("Complejo: "+cine.getComplejos().get(opcionComplejo));
        unaVista.Draw("Pelicula seleccionada: " + cine.getPelicula(opcionPelicula));
        unaVista.Draw("Sala seleccionada: "+cine.getSala(opcionSala));
        unaVista.Draw("Butaca seleccionada: "+opcionButaca);
        unaVista.Draw("Desea confirmar la compra...");
        

        
    }
}
