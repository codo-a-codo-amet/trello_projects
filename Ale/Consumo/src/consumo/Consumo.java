package consumo;

public class Consumo {

    public static void main(String[] args) {
            //Crear objetos de la clase AparatoElectrico
        AparatoElectrico bombilla = new AparatoElectrico(150);  
        AparatoElectrico plancha = new AparatoElectrico(2000);

        AparatoElectrico.imprimirConsumo(); //Muestra el consumo total
        bombilla.enciende(); //Enciende la bombilla
        plancha.enciende(); //Enciende la plancha

        AparatoElectrico.imprimirConsumo();//Muestra el consumo total
        plancha.apaga(); //Apaga la plancha

        AparatoElectrico.imprimirConsumo(); //Muestra el consumo total

    }
}
