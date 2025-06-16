package Recetas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class RestauranteTest {
    private Restaurante restaurante;

    @BeforeEach
    void setUp() {
        ArrayList<Receta> lista = new ArrayList<>();
        Restaurante restaurante = new Restaurante(lista);

        ArrayList<String> pasosPizza = new ArrayList<>();
        pasosPizza.add("Preparar la masa");
        pasosPizza.add("Agregar salsa");
        pasosPizza.add("Agregar queso");
        pasosPizza.add("Hornear");
        PlatoPrincipal pizza = new PlatoPrincipal(pasosPizza, Dificultad.INTERMEDIA, 15, 4);

        ArrayList<String> pasosEnsalada = new ArrayList<>();
        pasosEnsalada.add("Lavar vegetales");
        pasosEnsalada.add("Cortar ingredientes");
        Entrada ensalada = new Entrada(pasosEnsalada, Dificultad.FACIL, Temperatura.FRIA);

        ArrayList<String> pasosTorta = new ArrayList<>();
        pasosTorta.add("Hacer la masa");
        pasosTorta.add("Preparar el relleno");
        pasosTorta.add("Unir masa y relleno");
        pasosTorta.add("Hornear");
        pasosTorta.add("Dejar enfriar");
        Postre torta = new Postre(pasosTorta, Dificultad.DIFICIL, 180, false);

        restaurante.agregarReceta(pizza);
        restaurante.agregarReceta(ensalada);
        restaurante.agregarReceta(torta);
    }

    @Test
    void testCantidadRecetas() {
        assertEquals(3, restaurante.cantidadRecetas());
    }

    @Test
    void testAgregarReceta() {
        ArrayList<String> pasos = new ArrayList<>();
        pasos.add("Paso 1");
        Receta nueva = new Entrada(pasos, Dificultad.FACIL, Temperatura.CALIENTE);
        restaurante.agregarReceta(nueva);
        assertEquals(4, restaurante.cantidadRecetas());
    }

    @Test
    void testBorrarReceta() {
        restaurante.borrarReceta(pizza);
        assertEquals(2, restaurante.cantidadRecetas());
        assertFalse(restaurante.getRecetas().contains(pizza));
    }

    @Test
    void testModificarReceta() {
        ArrayList<String> nuevosPasos = new ArrayList<>();
        nuevosPasos.add("Nuevo paso 1");
        Receta recetaModificada = new PlatoPrincipal(nuevosPasos, Dificultad.DIFICIL, 30, 2);
        restaurante.modificarReceta(recetaModificada, pizza);
        assertEquals(3, restaurante.cantidadRecetas());
        assertFalse(restaurante.getRecetas().contains(pizza));
        assertTrue(restaurante.getRecetas().contains(recetaModificada));
    }

    @Test
    void testFiltraPorDificultad() {
        ArrayList<Receta> faciles = restaurante.filtraPorDificultad(Dificultad.FACIL);
        assertEquals(1, faciles.size());
        assertEquals(ensalada, faciles.get(0));
    }

    @Test
    void testFiltrarRecetasPorTipo() {
        ArrayList<Receta> delTipo = restaurante.filtrarRecetasPorTipo(pizza);
        assertEquals(3, delTipo.size());
    }

    @Test
    void testRecetaConMasPasos() {
        Receta masPasos = restaurante.recetaConMasPasos();
        assertEquals(tarta, masPasos);
    }
}
