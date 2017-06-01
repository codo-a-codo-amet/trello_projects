package poo;

public class Caballo implements ICuadrupedos{

    @Override
    public String trotar() {
        return "Rapido";
    }

    @Override
    public String dameTuNombre() {
        return "Jony";
    }

    @Override
    public String color() {
        return "Marron";
    }
    
}
