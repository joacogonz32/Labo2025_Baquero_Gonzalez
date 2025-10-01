package Sistema_Prestamos;

public abstract class Publicacion {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int stock;
    private TipoPublicacion tipo;

    public Publicacion(String titulo, String autor, int anioPublicacion, int stock, TipoPublicacion tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.stock = stock;
        this.tipo = tipo;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public int getStock() { return stock; }
    public TipoPublicacion getTipo() { return tipo; }
    public void reducirStock() { stock--; }
    public void aumentarStock() { stock++; }

    public abstract String obtenerInfo();
    public abstract TipoPublicacion tipo();
}
