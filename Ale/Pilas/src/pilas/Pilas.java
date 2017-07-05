
package pilas;

import java.util.Stack;

public class Pilas {
/*
 Una Pila es un conjunto finito de elementos del mismo tipo de dato donde
agregar o eliminar elementos se realiza solamente desde un extremo de la estructura,
que llamaremos cima de la pila.
La Pila es una estructura ordenada porque sus componentes están ordenados de acuerdo
al tiempo que llevan en la pila. Debido a que los elementos se insertan y eliminan 
solo por el extremo de la Pila, se dice que es una estructura de tipo LIFO 
(Last In First Out), el último elemento en ingresar es el primero en salir.
 Java nos provee de una clase llamada Stack la cual nos da el comportamiento
    y los operadores necesarios para trabajar con este tipo de dato.
    Para utilizarlo debemos importarlo previamente: 
    import java.util.Stack;

    Operadores de Pilas:
    Push: Tiene como precondición que la pila no esté llena. Agrega un elemento a la pila
    Pop: Tiene como precondición que la pila no esté vacía. Muestra y quita el dato que se encuentra en la cima
    Empty: Devuelve true si la pila esta vacia y false si no lo esta.
    Peek: Muestra el ultimo elemento de la pila.
    */
    
    public static void main(String[] args) {
Stack pila = new Stack(); // Creamos un objeto pila de la clase Stack
pila.push(10); // El metodo push agrega un elemento a la pila = indice 0
pila.push(50); // Agrega el segundo elemento = indice 1
pila.push(100); // Agrega el tercer elemento = indice 2
System.out.println("El ultimo elemento de la pila es: " + pila.peek()); //Con el metodo peek podemos ver el ultimo elemento de la pila
System.out.println(pila.pop()); // El metodo pop devuelve el ultimo elemento y lo elimina 
System.out.println("El ultimo elemento de la pila es: " + pila.peek());

    } 
}