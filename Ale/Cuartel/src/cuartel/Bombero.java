package cuartel;

public class Bombero {
   private String nombre;
   private String apellido;
   private int edad;
   private boolean casado;
   private final int id;  
   private static int idSiguiente=1;

    //constructor
    public Bombero(String nombre, String valorApellido, int valorEdad, boolean valorCasado) {
        this.nombre = nombre;
        this.apellido = valorApellido;
        this.edad = valorEdad;
        this.casado = valorCasado;
        this.id = idSiguiente;
        idSiguiente++;
        
    }

    //metodos set
    public void setNombre(String valorNombre) {
        this.nombre = valorNombre;
    }

    public void setApellido(String valorApellido) {
        apellido = valorApellido;
    }

    public void setEdad(int valorEdad) {
        edad = valorEdad;
    }

    public void setCasado(boolean valorCasado) {
        casado = valorCasado;
    }

    //metodo Get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getedad() {
        return edad;
    }

    public boolean getCasado() {
        return casado;
    }
    public int getId(){
    return id;
    }
    public static int getIdSiguiente(){
    return Bombero.idSiguiente;
    }
    
public String toString(){
String texto  = "El nombre: " + this.nombre + "Apellido: " + this.apellido + "Edad: " + this.edad;
return texto;
}
}
