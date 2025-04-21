package Arrays;
import Unidad1.Cancion;
import Unidad1.Persona;

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
        this.artista = new Persona("Bad Bunny", 30, "Puerto Rico");
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
    public void reemplazarCancion(int posicion, Cancion cancionReemplazante,ArrayList<Cancion> cd){
        for (int i = 0; i < cd.size(); i++) {
            if (i == posicion){
                cd[i] = cd[i].replace(cancionReemplazante);
            }
        }
    }
    public void AgregarCancion(){

    }
    public void borrarCancion(){

    }
    public static void main(String[] args) {
        int posicion = 2;
        Persona Anuel = new Persona("Anuel", 37, "Puerto Rico");
        Cancion cancion1 = new Cancion("Que Nos Paso", Anuel);
        Cancion cancion2 = new Cancion("Brrr", Anuel);
        Cancion cancion3 = new Cancion("No Love", Anuel);
        Cancion cancionReemplazante = new Cancion("Narcos", Anuel);
        ArrayList<Cancion> cd = new ArrayList<Cancion>();
        cd.add(cancion1);
        cd.add(cancion2);


    }
}
