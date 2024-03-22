package test;

import org.junit.Before;
import org.junit.Test;

import codigos.Lista;
import codigos.SubLista;

import static org.junit.Assert.*;

public class SubListaTest {

    private SubLista<Integer> lista;

    @Before
    public void setUp() {
        lista = new SubLista<>();
    }

    @Test
    public void testSubListaDeListaVacia() {
        // Crear una sub-lista de una lista vacía debe devolver una lista vacía
        Lista<Integer> subLista = lista.subLista(0, 1);
        assertEquals("La sub-lista de una lista vacía debe estar vacía", 0, subLista.tamaño);
    }

    @Test
    public void testSubListaInicioEnCero() {
        // Verificar sub-lista desde el inicio
        for (int i = 1; i <= 5; i++) {
            lista.agregarAlFinal(i);
        }
        Lista<Integer> subLista = lista.subLista(0, 3);
        assertEquals("La sub-lista debe tener 3 elementos", 3, subLista.tamaño);

        int contador = 1;
        for (Integer item : subLista) {
            assertEquals("Elemento incorrecto en la sub-lista", Integer.valueOf(contador++), item);
        }
    }

    @Test
    public void testSubListaDesdeMedio() {
        // Verificar sub-lista que comienza en medio
        for (int i = 1; i <= 5; i++) {
            lista.agregarAlFinal(i);
        }
        Lista<Integer> subLista = lista.subLista(2, 2);
        assertEquals("La sub-lista debe tener 2 elementos", 2, subLista.tamaño);

        int esperado = 3; // La sub-lista empieza en el tercer elemento
        for (Integer item : subLista) {
            assertEquals("Elemento incorrecto en la sub-lista", Integer.valueOf(esperado++), item);
        }
    }

}
