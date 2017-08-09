package empresa;
//import javax.swing.JOptionPane;

public class Empresa {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Diego", "Fernandez", 32, 565857439);
        Empleado empleado2 = new Empleado("Alberto", "Ramirez", 43, 335678766);
        empleado1.imprimir();
        empleado2.imprimir();

        
        
        
        
        
        
        
        
        
        
        
        /* //Creamos un registro de la clase Empleado con 3 elementos
       Empleado[] empleados = new Empleado[3];
       //Guardamos en cada indice un objeto
       empleados [0] = new Empleado("Jorge","Hernandez",36,38404199);
       empleados [1] = new Empleado("Pedro","Rodriguez",24,38404199);
       empleados [2] = new Empleado("Javier","Rodriguez",28,38404199);
       //Acumulamos los valores de los objetos en una cadena 
       String cadena = "";
        for (int i = 0; i < empleados.length; i++) {
        //Para guardar un objeto en una cadena tenemos que convertir el objeto a String
        cadena = cadena + empleados[i].toString() + "\n";    
        }
        //Una vez acumulado los objetos en un String lo imprimimos
       JOptionPane.showMessageDialog(null,  cadena + "La cantidad total de empleados es: " + Empleado.getContadorEmpleado(), "Info", -1); 
         */
    }

}
