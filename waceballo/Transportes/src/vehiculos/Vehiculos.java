package vehiculos;

public class Vehiculos {

    public String marca;
    public String modelo;
    public Integer anio;
    public String tipo;
    public Integer cantidadRuedas;
    public String combustible;
    public Integer pasajeros;
    public Integer puertas;
    public String color;

    public Vehiculos() {
        marca = "";
        modelo = "";
        anio = 0;
        tipo = "";
        cantidadRuedas = 0;
        combustible = "";
        pasajeros = 0;
        puertas = 0;
        color = "";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(Integer cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public Integer getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Integer pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
