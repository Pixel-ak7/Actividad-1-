package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigos.InsertarLista;
import codigos.Lista;

public class InsertarListaTest {

    private InsertarLista<Integer> insertarLista; // crea una instancia DE LA lista para las pruebas

    @Before
    public void setUp() throws Exception {
        // Se ejecuta antesde cada test, resetea la lista
        insertarLista = new InsertarLista<>();
    }

    @Test
    public void testInsertarListaVacia() {
        // prueba insertar una list que ste vacia
        Lista<Integer> listaAInsertar = new Lista<>();
        insertarLista.insertarLista(listaAInsertar);
        assertEquals(" lista seguir estando vacía", 0, insertarLista.tamaño);
    }

    @Test
    public void testInsertarListaEnListaVacia() {
        // Prueba insertar una lista con elementos a una lista que este vacía
        Lista<Integer> listaAInsertar = new Lista<>();
        listaAInsertar.agregarAlFinal(1);
        listaAInsertar.agregarAlFinal(2);
        insertarLista.insertarLista(listaAInsertar);
        assertEquals(" lista beberia contener 2 elementos", 2, insertarLista.tamaño);
    }

    @Test
    public void testInsertarListaConElementos() {
        // prueba insertar una lista con elementos en otra lista que ya tenia algun
        // elemento
        insertarLista.agregarAlFinal(10); // debera prepar la lista que ricbe
        insertarLista.agregarAlFinal(20);

        Lista<Integer> listaAInsertar = new Lista<>(); // prepara una list para insertarla
        listaAInsertar.agregarAlFinal(1);
        listaAInsertar.agregarAlFinal(2);

        int tamañoEsperado = insertarLista.tamaño + listaAInsertar.tamaño; // calcula tamaño

        insertarLista.insertarLista(listaAInsertar); // la pone en la listaa

        // Verifica que el tamaño final es el esperado
        assertEquals(" lista deberia tener todos los elementos de ambas listas", tamañoEsperado, insertarLista.tamaño);

        // Verifica que los elementos estan en el orden esperado
        int[] resultadoEsperado = { 10, 20, 1, 2 };
        int i = 0;
        for (Integer valor : insertarLista) {
            assertEquals("El elemento en la posición " + i + " no es el esperado", resultadoEsperado[i], (int) valor);
            i++;
        }
    }
}
