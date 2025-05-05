package VideoClub;
import java.util.ArrayList;
import VideoClub.Pelicula;
import VideoClub.Estanteria;

public class VideoClub {
    private String direccion;
    private int codigoPostal;
    private ArrayList<Estanteria> estanterias;

    public VideoClub(String direccion, int codigoPostal, ArrayList<Estanteria> estanterias) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.estanterias = estanterias;
    }
    public VideoClub() {
        this.direccion = "Tamborini 3574";
        this.codigoPostal = 1432;
        this.estanterias = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public ArrayList<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(ArrayList<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }

    public void agregar_Estanterias(Estanteria estanteriaNueva){
        estanterias.add(estanteriaNueva);
    }
    public void eliminar_Estanterias(Estanteria estanteriaVieja){
        estanterias.remove(estanteriaVieja);
    }
    public void modificar_Estanterias(Estanteria estanteriaVieja, Estanteria estanteriaNueva) {
        estanterias.remove(estanteriaVieja);
        estanterias.add(estanteriaNueva);
    }

    public Pelicula duracionPeliculaMasLarga() {
        String nombreAux = "";
        Pelicula peliculaAux = peliculas.get(0);
        int indice = peliculas.get(0).getDuracion();
        for (int i = 0; i < peliculas.size(); i++) {
            if (indice < peliculas.get(i).getDuracion()) {
                indice = peliculas.get(i).getDuracion();
                peliculaAux = peliculas.get(i);
            }
        }
        return peliculaAux;
    }

    public void MostrarNombreyEstanteria(){
        Pelicula peliculaMayor = new Pelicula();
        Estanteria estanteriaMayor = new Estanteria();
        for (Estanteria estanteria : estanterias){
            for (Pelicula pelicula: estanteria.getPeliculas()){
                if (pelicula.getDuracion() > peliculaMayor.getDuracion()){
                    peliculaMayor = pelicula;
                    estanteriaMayor = estanteria;
                }
            }
        }
        System.out.println("La pelicula mas larga es: "+peliculaMayor.getNombre()+", y se encuentra en la estanteria "+estanteriaMayor);
    }

    

    public static void main(String[] args) {
        Estanteria estanteriaVieja = new Estanteria();
        Estanteria estanteriaNueva = new Estanteria();
    }
}
