package vehiculos;

public class Colectivos extends Vehiculos implements I_Datos{
    
    public String Marca() {
        return marca = "Mercedez Benz";
    }

    public String Modelo() {
        return modelo = "1114";
    }

    public Integer Anio() {
        return anio = 1995;
    }

    public String Tipo() {
        return tipo = "Escolar";
    }

    public Integer CantidadRuedas() {
        return 6;
    }

    public String Combustible() {
        return "Gas Oil";
    }

    public Integer Pasajeros() {
        return 30;
    }

    public Integer Puertas() {
        return 1;
    }

    public String Color() {
        return "Naranja";
    }
    
    
    
}
