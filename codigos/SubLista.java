package codigos;

// Subsista.java
public class SubLista<T> extends Lista<T> {
    // rea una sublist adesde un punto de inicio hasta un tamaño dado
    public Lista<T> subLista(int inicio, int tamaño) {
        Lista<T> resultado = new Lista<>(); // nueva lista para los resultados
        Nodo<T> actual = cabeza; // comienza desde la cabeza de la lista
        int contador = 0; // contador para saber dónde estamos
        while (actual != null && contador < inicio + tamaño) { // recorr ehasta alcanzar el final de la sublista deseada
            if (contador >= inicio) { // si el contador llega al inicio deseado, empieza a agregar
                resultado.agregarAlFinal(actual.dato); // agrega el dato al final de la list a resultado
            }
            actual = actual.siguiente; // pasa al siguiente nodo
            contador++; // incrementa el contador
        }
        return resultado; // devuelve la lista resultado
    }
}
