package automotriz;

public class Auto {
// Atributos
    private int ruedas;
    private int peso;
    private int largo;
    private int ancho;
    private int motor;

    public Auto() {
        // El constructor le da un estado inicial a los objetos de la clase
        ruedas = 4;
        peso = 500;
        largo = 2000;
        ancho = 300;
        motor = 1600;
    }

    // Getters 
    public int getRuedas() {
        return ruedas;
    }

    public int getPeso() {
        return peso;
    }

    public int getAncho() {
        return ancho;
    }

    public int getLargo() {
        return largo;
    }

    public int getMotor() {
        return motor;
    }
    //Setters
    public void setRuedas(int ruedas){
    this.ruedas = ruedas;
    }
    public void setPeso(int peso){
    this.peso = peso;
    }
    public void setAncho(int ancho){
    this.ancho = ancho;
    }
    public void setLargo(int largo){
    this.largo = largo;
    }
    public void setMotor(int motor){
    this.motor = motor;
    }
    
}
