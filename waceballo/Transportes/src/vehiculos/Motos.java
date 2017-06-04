package vehiculos;

public class Motos extends Vehiculos implements I_Datos{

    public String Marca() {
        return marca = "Honda";
    }

    public String Modelo() {
        return modelo = "1200";
    }

    public Integer Anio() {
        return anio = 2000;
    }

    public String Tipo() {
        return tipo = "Moto";
    }

    public Integer CantidadRuedas() {
        return 2;
    }

    public String Combustible() {
        return "Nafta";
    }

    public Integer Pasajeros() {
        return 2;
    }

    public Integer Puertas() {
        return 0;
    }

    public String Color() {
        return "Rojo";
    }
    
    
    
}
