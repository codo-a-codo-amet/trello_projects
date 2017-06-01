package poo;

public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro unPerro = new Perro();
        System.out.println("Perro");
        System.out.println(unPerro.dameTuNombre());
        System.out.println(unPerro.trotar());
        System.out.println(unPerro.color());
        
        System.out.println("----------------------------");
        
        Gato unGato = new Gato();
        System.out.println("Gato");
        System.out.println(unGato.dameTuNombre());
        System.out.println(unGato.trotar());
        System.out.println(unGato.color());
        
        System.out.println("----------------------------");
        
        Caballo unCaballo = new Caballo();
        System.out.println("Caballo");
        System.out.println(unCaballo.dameTuNombre());
        System.out.println(unCaballo.trotar());
        System.out.println(unCaballo.color());

    }
    
}
