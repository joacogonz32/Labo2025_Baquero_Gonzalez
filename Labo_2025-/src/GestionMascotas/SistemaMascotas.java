package GestionMascotas;
import java.util.ArrayList;

public class SistemaMascotas {
    private ArrayList<Mascota> mascotas;

    public void eliminarMuerto (Mascota mascota){
        if(mascota.estoyMuerto() == true){
            mascotas.remove(mascota);
        }
    }
    public void agregarMascota(String nombre, Dueño dueño, Mascota tipoMascota){
        for(Mascota m: mascotas){
            if (m.getNombre().equals(nombre)){
                System.out.println("No se pudo agregar, una mascota con ese nombre ya existe");
            }
            else {
                tipoMascota.setNombre(nombre);
                tipoMascota.setDueño(dueño);
                mascotas.add(tipoMascota);
            }
        }
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

    public void borraPecesMuertos(){
        for (Mascota m: mascotas){
            if (m.getTipo() == TipoMascota.PEZ && m.estoyMuerto()){
                mascotas.remove(m);
            }
        }
    }

    public static void main(String[] args) {
        SistemaMascotas sistemaMascotas = new SistemaMascotas();
        Dueño joacoDueño = new Dueño("Joaquin", "Gonzalez");
        Dueño juanpiDueño = new Dueño("Juan Pablo", "Baquero");

        Mascota perro1 = new Perro("Ritter", joacoDueño, 2);
        Mascota perro2 = new Perro("Tato", juanpiDueño, 3);
        Mascota pajaro1 = new Pajaro("Rio", joacoDueño, 6);
        Mascota pajaro2 = new Cantor("Pooke", juanpiDueño, "Fiu",8);



        /* Aca se agregaria el perro1, pero lo cambio abajo por el gato2 */
        sistemaMascotas.agregarMascota("Tato", juanpiDueño, perro2);
        sistemaMascotas.agregarMascota("Rio", joacoDueño, pajaro1);
        sistemaMascotas.agregarMascota("Pooke", juanpiDueño, pajaro2);


        sistemaMascotas.eliminarMascota("Tato", juanpiDueño, perro2);




        perro1.getTipo();
        pajaro1.getTipo();
        pajaro2.getTipo();



        perro1.seAlimenta();
        pajaro1.seAlimenta();
        pajaro2.seAlimenta();




        perro1.saludar(juanpiDueño);
        perro2.saludar(juanpiDueño);
        perro1.saludar(joacoDueño);
        perro2.saludar(joacoDueño);

        pajaro1.saludar(joacoDueño);
        pajaro2.saludar(joacoDueño);
        pajaro1.saludar(juanpiDueño);
        pajaro2.saludar(juanpiDueño);


        sistemaMascotas.borraPecesMuertos();

    }
}
