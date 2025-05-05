package VideoClub;
import Unidad1.Persona;
import java.util.ArrayList;

public class Estanteria {
    private int identificador;
    private ArrayList<Pelicula> peliculas;

    public Estanteria(int identificador, ArrayList<Pelicula> peliculas) {
        this.identificador = identificador;
        this.peliculas = peliculas;
    }

    public Estanteria() {
        this.identificador = 10;
        this.peliculas = new ArrayList<>();
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void agregar_Pelicula(Pelicula peliculaAgregar) {
        peliculas.add(peliculaAgregar);
    }

    public void eliminar_Pelicula(Pelicula peliculaBorrar) {
        peliculas.remove(peliculaBorrar);
    }

    public void modificar_Pelicula(Pelicula peliculaVieja, Pelicula peliculaNueva) {
        peliculas.remove(peliculaVieja);
        peliculas.add(peliculaNueva);
    }

    public static void main(String[] args) {
        Pelicula peliculaVieja = new Pelicula(); //Pelicula en el vector
        Pelicula peliculaNueva = new Pelicula(); //Pelicula afuera del vector
        Pelicula peliculaAux = new Pelicula();


    }
}
