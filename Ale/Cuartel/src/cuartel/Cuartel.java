package cuartel;

public class Cuartel {

    public static void main(String[] args) {        
        Bombero bom = new Bombero("Martin", "Fernandez", 28, true);
       
        Bombero bom2 = new Bombero("Pedro","Fernandez", 34, true);
        
        System.out.println(Bombero.getIdSiguiente());
        System.out.println("Nombre: " + bom.getNombre() + " su Id es: " + bom.getId());
        System.out.println("Nombre: " + bom2.getNombre() + " su Id es: " + bom2.getId());
 
        
    }

}
