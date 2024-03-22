package test;

import org.junit.Before;
import org.junit.Test;

import codigos.InvertirLista;

import static org.junit.Assert.*;

public class InvertirListaTest {

    private InvertirLista<Integer> lista;

    @Before
    public void setUp() {
        lista = new InvertirLista<>();
    }

    @Test
    public void testInvertirListaVacia() {
        // Verificar que invertir una lista vacía no cause errores
        lista.invertir();
        assertNull("La cabeza de la lista debe seguir siendo null", lista.cabeza);
    }

    @Test
    public void testInvertirListaConUnElemento() {
        // Verificar que invertir una lista de un solo elemento no cambie el elemento
        lista.agregarAlFinal(1);
        lista.invertir();
        assertNotNull("La lista no debe ser vacía", lista.cabeza);
        assertEquals("La cabeza de la lista debe ser el mismo único elemento", Integer.valueOf(1), lista.cabeza.dato);
    }

    @Test
    public void testInvertirListaConVariosElementos() {
        // Verificar el orden correcto tras invertir una lista con varios elementos
        lista.agregarAlFinal(1);
        lista.agregarAlFinal(2);
        lista.agregarAlFinal(3);
        lista.invertir();

        int[] resultadoEsperado = { 3, 2, 1 };
        int i = 0;

        for (Integer valor : lista) {
            assertEquals("El elemento en la posición invertida no es el esperado", resultadoEsperado[i++], (int) valor);
        }
    }
}
