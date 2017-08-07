
package colas;

import java.util.LinkedList;

public class Colas {


    /*
 Una Cola es un conjunto finito de elementos del mismo tipo de dato donde los elementos se agregan 
 en un extremo, denominado final, y se eliminan por el otro extremo, denominado frente.
Se denominan tambiÃ©n: FIFO -> First In First Out), debido a que el primer elemento en entrar serÃ¡ tambiÃ©n 
el primero en salir.
    
    Operadores de Cola:
    add: Agrega un elemento a la cola
    remove: Muestra y quita el dato que se encuentra en el inicio de la cola.
    isEmpty: Devuelve true si la cola esta vacia y false si no lo esta.
    peek: Muestra el primer elemento de la cola.
     */
    
    public static void main(String[] args) {
        LinkedList cola = new LinkedList();// Creamos un objeto cola de la clase LinkedList
        cola.add(10); //El metodo add agrega un elemento a la cola = indice 0
        cola.add(50);
        cola.add(100);

        System.out.println("El primer elemento de la cola es: " + cola.peek()); //Con el metodo peek podemos ver el primer elemento de la cola
        System.out.println(cola.remove()); // El metodo remove devuelve el primer elemento y lo elimina 
        System.out.println("El ultimo elemento de la cola es: " + cola.peek());
    }
}