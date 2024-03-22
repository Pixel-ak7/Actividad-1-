package codigos;

// InvertirLista.java
public class InvertirLista<T> extends Lista<T> {
    // invierte el orden de los elementos en la lista
    public void invertir() {
        Nodo<T> previo = null; // para guardar el nodo anterior
        Nodo<T> actual = cabeza; // comienza por la cabeza de la lista
        Nodo<T> siguiente = null; // para guardar el siguiente nodo
        while (actual != null) {
            siguiente = actual.siguiente; // guarda el siguiente nodo
            actual.siguiente = previo; // invierte el enlace actual hacia el nodo anterior
            previo = actual; // mueve previo a la posición actual
            actual = siguiente; // avanza al siguiente nodo
        }
        cabeza = previo; // actualiza la cabeza de la lista a la última posición previa
    }
}
