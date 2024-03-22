package codigos;

// InsertarLista.java
public class InsertarLista<T> extends Lista<T> {
    // inserta todos los elementos de otraLista al final de esta lista
    public void insertarLista(Lista<T> otraLista) {
        for (T elemento : otraLista) {
            agregarAlFinal(elemento); // usa el método que heredo para añadir al final
        }
    }
}
