package Sistema_Prestamos;

public class Audiolibro extends Publicacion {
    private int duracion;
    private double pesoArchivo;
    private static TipoPublicacion tipoPublicacion = TipoPublicacion.AUDIOLIBRO;

    public Audiolibro(String titulo, String autor, int anioPublicacion, int stock, int duracion, double pesoArchivo) {
        super(titulo, autor, anioPublicacion, stock, TipoPublicacion.AUDIOLIBRO);
        this.duracion = duracion;
        this.pesoArchivo = pesoArchivo;
    }
    @Override
    public TipoPublicacion tipo(){
        return TipoPublicacion.AUDIOLIBRO;
    }

    @Override
    public String obtenerInfo() {
        return "Sistema_Prestamos.Audiolibro: " + getTitulo() + " por " + getAutor() + " (" + getAnioPublicacion() + ") - Duración: " + duracion + " min, Peso: " + pesoArchivo + " MB";
    }
}
