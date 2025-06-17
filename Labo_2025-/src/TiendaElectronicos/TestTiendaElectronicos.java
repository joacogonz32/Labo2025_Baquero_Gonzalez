package TiendaElectronicos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTiendaElectronicos {
    private SistemaTienda sistema;
    private CargadoresPortatiles cargadorPortatil;
    private EquipoSonido equipo;
    private Televisor televisor;

    @BeforeEach
    public void setUp() {
        sistema = new SistemaTienda();

        cargadorPortatil = new CargadoresPortatiles("PowerBank X", 4500.0, 20);
        cargadorPortatil.setCantCargas(5);

        equipo = new EquipoSonido("Parlante JBL", 12500.0, 10);
        televisor = new Televisor("Smart TV 50'", 250000.0, 5);

        sistema.agregarDispositivo(cargadorPortatil);
        sistema.agregarDispositivo(equipo);
        sistema.agregarDispositivo(televisor);
    }

    @Test
    public void testAgregarDispositivos() {
        assertEquals(3, getCantidadProductos());
    }

    @Test
    public void testMenorStock() {
        assertEquals(5, sistema.menorStock());
    }

    @Test
    public void testMayorStock() {
        assertEquals(20, sistema.mayorStock());
    }

    @Test
    public void testModificarDispositivo() {
        CargadoresPortatiles nuevoCargador = new CargadoresPortatiles("PowerBank Pro", 6000.0, 15);
        nuevoCargador.setCantCargas(8);
        sistema.modificarDispositivo(cargadorPortatil, nuevoCargador);

        assertEquals(3, getCantidadProductos());
        assertEquals(15, sistema.mayorStock());
    }

    @Test
    public void testSetYGetCargador() {
        assertEquals(5, cargadorPortatil.getCantCargas());
        cargadorPortatil.setCantCargas(10);
        assertEquals(10, cargadorPortatil.getCantCargas());
    }

    private int getCantidadProductos() {
        return sistema.getDispositivos().size();
    }
}
