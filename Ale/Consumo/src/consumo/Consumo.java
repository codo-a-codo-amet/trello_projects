package consumo;

public class Consumo {

    public static void main(String[] args) {
        AparatoElectrico bombilla = new AparatoElectrico(150);
        AparatoElectrico plancha = new AparatoElectrico(2000);

        AparatoElectrico.imprimir(); //Muestra el consumo total
        bombilla.enciende(); //Enciende la bombilla
        plancha.enciende(); //Enciende la plancha

        AparatoElectrico.imprimir();//Muestra el consumo total
        plancha.apaga(); //Apaga la plancha

        AparatoElectrico.imprimir(); //Muestra el consumo total

    }
}
