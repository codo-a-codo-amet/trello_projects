package vehiculos;

public class Autos extends Vehiculos implements I_Datos{
    
    public String Marca() {
        return marca = "Ford";
    }

    public String Modelo() {
        return modelo = "Ecosport";
    }

    public Integer Anio() {
        return anio = 2009;
    }

    public String Tipo() {
        return tipo = "Familiar";
    }

    public Integer CantidadRuedas() {
        return 5;
    }

    public String Combustible() {
        return "Nafta";
    }

    public Integer Pasajeros() {
        return 5;
    }

    public Integer Puertas() {
        return 5;
    }

    public String Color() {
        return "Gris";
    }


    
    
}
