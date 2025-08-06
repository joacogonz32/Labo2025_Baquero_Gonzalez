package GestionMascotas;
import java.util.ArrayList;

public class SistemaMascotas {
    private ArrayList<Mascota> mascotas;

    public void eliminarMuerto (Mascota mascota){
        if(mascota. == true){
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

<<<<<<< HEAD

=======
    public void borraPecesMuertos(){
        for (Mascota m: mascotas){
            if (m.getTipo() == TipoMascota.PEZ && m.estoyMuerto()){
                mascotas.remove(m);
            }
        }
    }
>>>>>>> a3f38821605120119ab2506a7a850a6ec5eb2c98

    public static void main(String[] args) {
        SistemaMascotas sistemaMascotas = new SistemaMascotas();
        Dueño joacoDueño = new Dueño("Joaquin", "Gonzalez");
        Dueño juanpiDueño = new Dueño("Juan Pablo", "Baquero");
        Mascota gato1 = new Gato("Sasha", joacoDueño, 7);
        Mascota gato2 = new Gato("Brisa", juanpiDueño, 4);
        Mascota perro1 = new Perro("Ritter", joacoDueño, 2);
        Mascota perro2 = new Perro("Tato", juanpiDueño, 3);
        Mascota pajaro1 = new Pajaro("Rio", joacoDueño, 6);
        Mascota pajaro2 = new Cantor("Pooke", juanpiDueño, "Fiu",8);
        Mascota pez1 = new Pez("Frank", joacoDueño, 8);
        Mascota pez2 = new Pez("Renato", juanpiDueño, 1);

        sistemaMascotas.agregarMascota("Sasha", joacoDueño, gato1);
        sistemaMascotas.agregarMascota("Brisa", juanpiDueño, gato2);
        /* Aca se agregaria el perro1, pero lo cambio abajo por el gato2 */
        sistemaMascotas.agregarMascota("Tato", juanpiDueño, perro2);
        sistemaMascotas.agregarMascota("Rio", joacoDueño, pajaro1);
        sistemaMascotas.agregarMascota("Pooke", juanpiDueño, pajaro2);
        sistemaMascotas.agregarMascota("Frank", joacoDueño, pez1);
        sistemaMascotas.agregarMascota("Renato", juanpiDueño, pez2);

        sistemaMascotas.eliminarMascota("Tato", juanpiDueño, perro2);

        sistemaMascotas.modificarMascota(gato2, perro1);

        gato1.getTipo();
        perro1.getTipo();
        pajaro1.getTipo();
        pajaro2.getTipo();
        pez1.getTipo();

        gato1.seAlimenta();
        perro1.seAlimenta();
        pajaro1.seAlimenta();
        pajaro2.seAlimenta();
        pez1.seAlimenta();

        gato1.saludar(joacoDueño);
        gato2.saludar(joacoDueño);
        gato1.saludar(juanpiDueño);
        gato2.saludar(juanpiDueño);

        perro1.saludar(juanpiDueño);
        perro2.saludar(juanpiDueño);
        perro1.saludar(joacoDueño);
        perro2.saludar(joacoDueño);

        pajaro1.saludar(joacoDueño);
        pajaro2.saludar(joacoDueño);
        pajaro1.saludar(juanpiDueño);
        pajaro2.saludar(juanpiDueño);

        pez1.saludar(joacoDueño);
        pez1.saludar(joacoDueño);
        pez2.saludar(juanpiDueño);
        pez2.saludar(juanpiDueño);

        sistemaMascotas.borraPecesMuertos();

    }
}
