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

    public void MostrarNombreyEstanteria(Pelicula peliculaMasLarga, int identificador){
        int EstanteriaMasLargaID = 0;
        for (Estanteria estanteria : estanterias){
            for (Pelicula pelicula: estanteria.getPeliculas()){
                EstanteriaMasLargaID = estanteria.getIdentificador();
            }
        }
        System.out.println("La pelicula mas larga es: "+peliculaMasLarga.getNombre()+", y se encuentra en la estanteria "+EstanteriaMasLargaID);
    }



    public static void main(String[] args) {
        Estanteria estanteriaVieja = new Estanteria();
        Estanteria estanteriaNueva = new Estanteria();
    }
}
