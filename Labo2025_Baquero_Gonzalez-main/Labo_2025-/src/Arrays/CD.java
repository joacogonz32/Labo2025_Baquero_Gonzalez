package Arrays;
import Objetos1.Cancion;
import Objetos1.Persona;
import java.util.ArrayList;
import java.util.Arrays;

public class CD {
    private String titulo;
    private Persona artista;

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

    public CD(){
        this.titulo = "Vuelve";
        this.artista = new Persona("Bad Bunny", 35, "Puerto Rico");
    }
    public CD(String titulo, Persona artista){
        this.titulo = titulo;
        this.artista = artista;
    }

    public int cantCanciones(ArrayList<Cancion> cd){
        int cantidad = cd.size();
        return cantidad;
    }

    public void verCancion(int posicion,ArrayList<Cancion> cd) {
        for (int i = 0; i < cd.size(); i++) {
            if (i == posicion) {
                System.out.println(cd.get(i));
            }
        }
    }

    public void reemplazarCancion(int posicion, Cancion cancionReemplazante, ArrayList<Cancion> cd){
        for (int i = 0; i < cd.size(); i++) {
            if (i == posicion){
                cd[i] = cd[i].replace(cancionReemplazante);
            }
        }
    }

    public void AgregarCancion(ArrayList<Cancion> cd){
        cd.add(nuevaCancion);
    }

    public void borrarCancion(int posicion, ArrayList<Cancion> cd){
        for (int i = 0; i < cd.size(); i++) {
            if (i == posicion){
                cd.remove(cd[i]);
            }
        }
    }

    public static void main(String[] args) {
        int posicion = 2;
        Persona Artista1 = new Persona("Anuel", 37, "Puerto Rico");
        Persona Artista2 = new Persona("Hades66", 25, "Puerto Rico");
        Persona Artista3 = new Persona("Bryant Myers", 37, "Puerto Rico");
        Cancion Cancion1 = new Cancion("Que Nos Paso", Artista1);
        Cancion Cancion2 = new Cancion("Brrr", Artista1);
        Cancion nuevaCancion = new Cancion("Lukeando", Artista2);
        Cancion cancionReemplazante = new Cancion("Air Drop", Artista3);
        ArrayList<Cancion> cd = new ArrayList<Cancion>();
        cd.add(Cancion1);
        cd.add(Cancion2);

        /* Falta ejecutar los metodos aca

    }
}
