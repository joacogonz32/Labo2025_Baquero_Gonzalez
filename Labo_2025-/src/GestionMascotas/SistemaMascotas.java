package GestionMascotas;
import java.util.ArrayList;

public class SistemaMascotas {
    private ArrayList<Mascota> mascotas;

    public void agregarMascota(String nombre, Dueño dueño, Mascota tipoMascota){
        tipoMascota.setNombre(nombre);
        tipoMascota.setDueño(dueño);
        mascotas.add(tipoMascota);
    }
    public void eliminarMascota(String nombre, Dueño dueño, Mascota tipoMascota){
        tipoMascota.setNombre(nombre);
        tipoMascota.setDueño(dueño);
        mascotas.remove(tipoMascota);
    }
    public void modificarMascota(Mascota mascotaVieja, Mascota mascotaNueva){
        mascotas.remove(mascotaVieja);
        mascotas.add(mascotaNueva);
    }

    public static void main(String[] args) {

    }
}
