package Arrays;
import Unidad1.Cancion;
import Persona.Persona;

import java.util.ArrayList;

public class CD {
    private String titulo;
    private Persona artista;
    private ArrayList<Cancion> cd;

    public CD() {
        this.titulo = "Vuelve";
        this.artista = new Persona("Bad Bunny", 30, "Puerto Rico");
        this.cd = new ArrayList<Cancion>();
        cd.add(new Cancion());
    }

    public CD(String titulo, Persona artista, Cancion cancion) {
        this.titulo = titulo;
        this.artista = artista;
        this.cd = new ArrayList<Cancion>();
        cd.add(cancion);
    }

    public String getTitulo() {
        return titulo;
    }

    public Persona getArtista() {
        return artista;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(Persona artista) {
        this.artista = artista;
    }


    public int cantCanciones() {
        int cantidad = cd.size();
        return cantidad;
    }

    public void verCancion(int posicion) {
        for (int i = 0; i < cd.size(); i++) {
            if (i == posicion) {
                System.out.println(cd.get(i));
            }
        }
    }

    public void reemplazarCancion(int posicion, Cancion cancionReemplazante) {
        for (int i = 0; i < cd.size(); i++) {
            if (i == posicion) {
                cd.set(posicion, cancionReemplazante);
            }
            // System.out.println(c.getTitulo());
        }
    }

    public void AgregarCancion(Cancion nuevaCancion) {
        cd.add(nuevaCancion);
        cantCanciones();
    }

    public void borrarCancion(int posicion) {
        for (int i = 0; i < cd.size(); i++) {
            if (i == posicion) {
                cd.remove(cd.get(i));
            }
        }
    }

    public void mostrarDatosCd() {
        for (int i = 0; i < cd.size(); i++) {
            Cancion c = cd.get(i);
            c.mostrarDatosCancion();
        }
    }

    public static void main(String[] args) {
        int posicion = 2;
        Persona Anuel = new Persona("Anuel", 37, "Puerto Rico");
        Persona Hades66 = new Persona("Hades66", 25, "Puerto Rico");
        Persona BryantMyers = new Persona("Bryant Myers", 37, "Puerto Rico");
        Cancion cancion1 = new Cancion("Que Nos Paso", Anuel);
        Cancion cancion2 = new Cancion("Brrr", Anuel);
        CD disco1 = new CD();
        CD disco2 = new CD("LLNM2", Anuel, cancion1);
        Cancion nuevaCancion = new Cancion("Lukeando", Hades66);
        Cancion cancionReemplazante = new Cancion("Air Drop", BryantMyers);
        ArrayList<Cancion> cd = new ArrayList<Cancion>();
        cd.add(cancion1);
        cd.add(cancion2);

        disco1.verCancion(posicion);
        disco1.reemplazarCancion(posicion, cancionReemplazante);
        disco1.AgregarCancion(nuevaCancion);
        disco1.borrarCancion(posicion);
        System.out.println("La cantidad de canciones es: " + disco1.cantCanciones());

        disco2.verCancion(posicion);
        disco2.reemplazarCancion(posicion, cancionReemplazante);
        disco2.AgregarCancion(nuevaCancion);
        disco2.borrarCancion(posicion);
        System.out.println("La cantidad de canciones es: " + disco2.cantCanciones());

        disco1.mostrarDatosCd();
        disco2.mostrarDatosCd();

    }
}
