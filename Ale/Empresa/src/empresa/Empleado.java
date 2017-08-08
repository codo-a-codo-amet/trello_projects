
package empresa;

import javax.swing.JOptionPane;

public class Empleado {
     private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private int numeroEmpleado;
    private static int contadorEmpleado = 0;

    public Empleado(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.numeroEmpleado = contadorEmpleado;
        this.numeroEmpleado++;
        Empleado.contadorEmpleado++;
    }

    public void imprimir(){
    JOptionPane.showMessageDialog(null,toString() + "\nCantidad total de empleados: "+getContadorEmpleado(),"Informacion",-1);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }


    public String toString() {
        return "Nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", D.N.I: " + dni + ", numero de empleado: " + numeroEmpleado;
    }
}
