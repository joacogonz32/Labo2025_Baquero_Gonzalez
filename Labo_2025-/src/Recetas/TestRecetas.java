package Recetas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class TestRecetas {
    private Restaurante restaurante;
    private Receta pizza, ensalada, torta;

    @BeforeEach
    void setUp() {

        ArrayList<Receta> listaRecetas = new ArrayList<>();
        ArrayList<String> pasosPizza = new ArrayList<>();
        pasosPizza.add("Preparar la masa");
        pasosPizza.add("Agregar salsa");
        pasosPizza.add("Agregar queso");
        pasosPizza.add("Hornear");
        pizza = new PlatoPrincipal(pasosPizza, Dificultad.INTERMEDIA);

        ArrayList<String> pasosEnsalada = new ArrayList<>();
        pasosEnsalada.add("Lavar vegetales");
        pasosEnsalada.add("Cortar ingredientes");
        ensalada = new Entrada(pasosEnsalada, Dificultad.FACIL);

        ArrayList<String> pasosTarta = new ArrayList<>();
        pasosTarta.add("Hacer la masa");
        pasosTarta.add("Preparar el relleno");
        pasosTarta.add("Unir masa y relleno");
        pasosTarta.add("Hornear");
        pasosTarta.add("Dejar enfriar");
        torta = new Postre(pasosTarta, Dificultad.DIFICIL);

        listaRecetas.add(pizza);
        listaRecetas.add(ensalada);
        listaRecetas.add(torta);

        restaurante = new Restaurante(listaRecetas);
    }

    @Test
    void testAgregarReceta() {
        Receta nuevaReceta = new Entrada(new ArrayList<>(), Dificultad.FACIL);
        restaurante.agregarReceta(nuevaReceta);
        assertEquals(4, restaurante.cantidadRecetas());
    }

    @Test
    void testBorrarReceta() {
        restaurante.borrarReceta(ensalada);
        assertEquals(2, restaurante.cantidadRecetas());
        assertFalse(restaurante.getRecetas().contains(ensalada));
    }

    @Test
    void testModificarReceta() {
        Receta nuevaReceta = new Entrada(new ArrayList<>(), Dificultad.FACIL);
        restaurante.modificarReceta(nuevaReceta, pizza);
        assertEquals(3, restaurante.cantidadRecetas());
        assertTrue(restaurante.getRecetas().contains(nuevaReceta));
        assertFalse(restaurante.getRecetas().contains(pizza));
    }

    @Test
    void testFiltraPorDificultad() {
        ArrayList<Receta> recetasIntermedias = restaurante.filtraPorDificultad(Dificultad.INTERMEDIA);
        assertEquals(1, recetasIntermedias.size());
        assertTrue(recetasIntermedias.contains(pizza));
    }

    @Test
    void testCantidadRecetas() {
        assertEquals(3, restaurante.cantidadRecetas());
    }

    @Test
    void testRecetaConMasPasos() {
        Receta recetaMasPasos = restaurante.recetaConMasPasos();
        assertEquals(torta, recetaMasPasos);
    }

    @Test
    void testFiltrarPorReceta() {
        ArrayList<Receta> recetasFiltradas = restaurante.filtrarPorReceta(pizza);
        assertEquals(1, recetasFiltradas.size());
        assertTrue(recetasFiltradas.contains(pizza));
    }
}
