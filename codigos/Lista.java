package codigos;

//sista.java
import java.util.Iterator;

//se define de la clase Lista que puede contener elementos de cualquier tipo
public class Lista<T> implements Iterable<T> {
    public Nodo<T> cabeza; // Puntero al primer elemento de la lista
    public int tamaño; // Contador de elementos en la lista

    // clase interna Nodo para almacenar datos y enlace al siguiente nodo
    public static class Nodo<T> {
        public T dato; // Dato almacenado en el nodo
        Nodo<T> siguiente; // Enlace al siguiente nodo

        // Constructor del nodo
        Nodo(T dato) {
            this.dato = dato;
            this.siguiente = null; // inicialmente no debe haber siguiente nodo
        }
    }

    // xontruye la list. inicia con una lista vacía
    public Lista() {
        cabeza = null; // inicialmente la lista esta vacia
        tamaño = 0; // inicialmente el tamaño de la lista deberia ser 0
    }

    // agregar un elemento al final de la lista
    public void agregarAlFinal(T dato) {
        if (cabeza == null) {
            cabeza = new Nodo<>(dato); // if lista esta vacia, el nuevo nodo sera nuestra cabeza ( suena extraño
                                       // decirle cabeza xd)
        } else {
            Nodo<T> actual = cabeza; // comienza por la cabeza
            while (actual.siguiente != null) { // se va hasta el final de la lista
                actual = actual.siguiente;
            }
            actual.siguiente = new Nodo<>(dato); // agrega el nuevo nodo al final
        }
        tamaño++; // s eincrementa el tamaño de la lista
    }

    // obtener un iterador de la lista (iterar el puntero)
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Nodo<T> actual = cabeza; // ocmienza por la cabeza para iterar

            @Override
            public boolean hasNext() {
                return actual != null; // if nodo actual no es nulo, hay mas elementos
            }

            @Override
            public T next() {
                T dato = actual.dato; // obtenemos el dato del nodo actual
                actual = actual.siguiente; // se va al siguiente nodo
                return dato; // se devuelve el dato
            }
        };
    }
}

// para ser sincero me ayude bastante con chat :D porque algunas cosas no
// funcionaban y me ayudaron a corregirlo y hacerlo mas rapdio ya que el tiempo
// no sobra tristemente.
// shhhh ;D
