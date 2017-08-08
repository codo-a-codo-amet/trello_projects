
package concesionaria;

import javax.swing.JOptionPane;

public class Coche {
 
    private String marca;
    private String modelo;
    private String color;
    private double precio;
    private static double descuento = 3500.0;

    public Coche(String marca, String modelo, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        if ("Fiat".equalsIgnoreCase(marca)) {
           precio=precio-descuento;
        } else {
            this.precio=precio;
        }
        return (double) precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static double getDescuento() {
        return descuento;
    }

    public static void setDescuento(double descuento) {
        Coche.descuento = descuento;
    }
    
   public String toString() {
        return "Marca: " + marca + ",  Modelo: " + modelo + ",  Color: " + color + ",  Precio: " + precio;
    }
   
   public void imprimir(){
   JOptionPane.showMessageDialog(null, toString() + "  Precio final " + getPrecio(), "Informacion", -1);
   }   
}
