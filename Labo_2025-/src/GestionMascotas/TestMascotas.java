package GestionMascotas;
import java.util.ArrayList;

public class TestMascotas {
    private Dueño dueño;
    private Mascota mascota;

    SistemaMascotas s1 = new SistemaMascotas();
    Dueño d1 = new Dueño("Joaquin", "Gonzalez");
        s1.agregarMascota("nodsno", d1, new Perro());
}
