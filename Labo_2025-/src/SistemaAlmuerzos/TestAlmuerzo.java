package SistemaAlmuerzos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Unidad1.Persona;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class TestAlmuerzo {

    private Buffet buffet;
    private Plato plato1, plato2, plato3;
    private Persona persona1;
    private Pedido pedido1, pedido2;

    @BeforeEach
    public void setup() {
        buffet = new Buffet();

        plato1 = new Plato("Milanesa", 1500, 0);
        plato2 = new Plato("Hamburguesa", 2000, 0);
        plato3 = new Plato("Pizza", 1800, 0);

        persona1 = new Persona("Juan", "Perez");

        ArrayList<Plato> platosPedido1 = new ArrayList<>();
        platosPedido1.add(plato1);
        platosPedido1.add(plato2);

        ArrayList<Plato> platosPedido2 = new ArrayList<>();
        platosPedido2.add(plato2);
        platosPedido2.add(plato3);

        pedido1 = new Pedido(platosPedido1, LocalDate.now(), Estado.PENDIENTE, LocalTime.of(13, 0), persona1);
        pedido2 = new Pedido(platosPedido2, LocalDate.now().minusDays(1), Estado.ENTREGADO, LocalTime.of(14, 0), persona1);

        buffet.agregarPedido(pedido1);
        buffet.agregarPedido(pedido2);
    }

    @Test
    public void testAgregarPedido() {
        assertEquals(2, buffet.getPedidos().size());
    }

    @Test
    public void testBorrarPedido() {
        buffet.borrarPedido(pedido2);
        assertEquals(1, buffet.getPedidos().size());
        assertFalse(buffet.getPedidos().contains(pedido2));
    }

    @Test
    public void testEditarPedido() {
        Pedido nuevoPedido = new Pedido(pedido1.getPlatoPedido(), LocalDate.now(), Estado.ENTREGADO, LocalTime.of(14,0), persona1);
        buffet.editarPedido(nuevoPedido, pedido1);
        assertTrue(buffet.getPedidos().contains(nuevoPedido));
        assertFalse(buffet.getPedidos().contains(pedido1));
    }

    @Test
    public void testPorCocinarHoy() {
        ArrayList<Pedido> pedidosHoy = buffet.porCocinarHoy();
        assertEquals(1, pedidosHoy.size());
        assertTrue(pedidosHoy.contains(pedido1));
    }

    @Test
    public void testCantidadVecesPedida() {
        int cantPlato2 = buffet.cantidadVecesPedida(plato2);
        assertEquals(2, cantPlato2);
    }

    @Test
    public void testTop3masPedidos() {
        ArrayList<Plato> top3 = buffet.top3masPedidos();
        assertFalse(top3.isEmpty());
        assertTrue(top3.contains(plato2));
    }
}
