package AlarmaEdificio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

    public class TestAlarmas {
        private SensorHumo sensorHumo;
        private SensorTemp sensorTemp;
        private SensorPresion sensorPresion;
        private Edificio edificio;

    @BeforeEach
    public void setUp() {
        sensorHumo = new SensorHumo(true, 12.0, 10.0, LocalDate.of(2020, 1, 1));
        sensorTemp = new SensorTemp(true, 15.0, 12.0, LocalDate.of(2021, 6, 1));
        sensorPresion = new SensorPresion(true, 14.0, 11.0, LocalDate.of(2022, 3, 15));

        ArrayList<Sensor> sensores = new ArrayList<>();
        sensores.add(sensorHumo);
        sensores.add(sensorTemp);
        sensores.add(sensorPresion);

        edificio = new Edificio(sensores, 10.0); // umbralPromedio
    }

    @Test
    public void testAgregarSensor() {
        SensorTemp nuevoSensor = new SensorTemp(true, 20.0, 18.0, LocalDate.now());
        edificio.agregarSensor(nuevoSensor);
        assertTrue(edificio.getSensores().contains(nuevoSensor));
    }

    @Test
    public void testEliminarSensor() {
        edificio.eliminarSensor(sensorTemp);
        assertFalse(edificio.getSensores().contains(sensorTemp));
    }

    @Test
    public void testModificarSensor() {
        SensorPresion nuevaPresion = new SensorPresion(true, 25.0, 20.0, LocalDate.now());
        edificio.modificarSensor(sensorPresion, nuevaPresion);
        assertFalse(edificio.getSensores().contains(sensorPresion));
        assertTrue(edificio.getSensores().contains(nuevaPresion));
    }

    @Test
    public void testDescartaFalsaAlarma() {
        // Este test no verifica impresión por consola, solo que no haya errores.
        assertDoesNotThrow(() -> edificio.descartaFalsaAlarma());
    }
}
