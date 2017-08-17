package consumo;

public class Consumo {

    public static void main(String[] args) {
        System.out.println(Math.pow(2, 2));
            //Crear objetos de la clase AparatoElectrico
        AparatoElectrico lampara = new AparatoElectrico(150);  
        AparatoElectrico plancha = new AparatoElectrico(2000);

        AparatoElectrico.imprimirConsumo(); //Muestra el consumo total
        lampara.enciende(); //Enciende la bombilla
        plancha.enciende(); //Enciende la plancha

        AparatoElectrico.imprimirConsumo();//Muestra el consumo total
        plancha.apaga(); //Apaga la plancha

        AparatoElectrico.imprimirConsumo(); //Muestra el consumo total

    }
}
