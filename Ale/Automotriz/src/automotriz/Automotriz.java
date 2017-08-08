package automotriz;

public class Automotriz {

    public static void main(String[] args) {
Auto objeto1 = new Auto();
Auto objeto2 = new Auto();
        System.out.println("La cantidad de ruedas " + objeto1.getRuedas());
        objeto1.setRuedas(3);
        System.out.println("La cantidad de ruedas " + objeto1.getRuedas());
        System.out.println("La cantidad de ruedas del objeto 2 es: " + objeto2.getRuedas());
    }

}
