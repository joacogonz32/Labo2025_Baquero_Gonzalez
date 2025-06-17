package TiendaElectronicos;

public class CargadoresPortatiles extends Producto{
    private int cantCargas;
    static Seccion cargadores = Seccion.CARGADORES;

    public CargadoresPortatiles(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }

    public int getCantCargas() {
        return cantCargas;
    }

    public void setCantCargas(int cantCargas) {
        this.cantCargas = cantCargas;
    }

    public static Seccion getCargadores() {
        return cargadores;
    }

    public static void setCargadores(Seccion cargadores) {
        CargadoresPortatiles.cargadores = cargadores;
    }
}
