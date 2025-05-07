package SistemaBancos;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class BancoNacion {
    private String direccion;
    private boolean rampaDiscapacitados;
    private boolean es24horas;
    private ArrayList<Trabajador> trabajadores;

    public BancoNacion(){
        this.direccion = "Av. Constituyentes 5451";
        this.rampaDiscapacitados = true;
        this.es24horas = true;
        this.trabajadores = new ArrayList<>();
    }

    public BancoNacion(String direccion, boolean rampaDiscapacitados, boolean es24horas){
        this.direccion = direccion;
        this.rampaDiscapacitados = rampaDiscapacitados;
        this.es24horas = es24horas;
        this.trabajadores = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isRampaDiscapacitados() {
        return rampaDiscapacitados;
    }

    public void setRampaDiscapacitados(boolean rampaDiscapacitados) {
        this.rampaDiscapacitados = rampaDiscapacitados;
    }

    public boolean isEs24horas() {
        return es24horas;
    }

    public void setEs24horas(boolean es24horas) {
        this.es24horas = es24horas;
    }

    public void agregarTrabajador(Trabajador trabajador){
    trabajadores.add(trabajador);
    }

    public int cantidadTrabajadores(){
        int cantidad = trabajadores.size();
        return cantidad;
    }

    public Trabajador empleadoMayorAntiguedad(){
        Trabajador trabajadorMasViejo = new Trabajador();
        for (Trabajador t : trabajadores){
            for (LocalDate fecha : t.getRegisterDate()){

        }
        return trabajadorMasViejo;
    }

    public static void main(String[] args) {
        Trabajador t1 = new Trabajador("Miguel", "Lopez", 32987990,
                LocalDate.of(1985, 10, 12),
                LocalDate.of(2020, 5, 8));
        Trabajador t2 = new Trabajador("Juana", "Gomez", 39987990,
                LocalDate.of(1986, 7, 28));
        Trabajador t3 = new Trabajador("Candela", "Navarro", 40987990,
                LocalDate.of(1993, 2, 4),
                LocalDate.of(2017, 5, 25));

        BancoNacion sucursalUrquiza = new BancoNacion("Av. Triunvirato 3450", true, false);
        BancoNacion sucursalPueyrredon = new BancoNacion("Cochrane 2874", true, true);
        BancoNacion sucursalDevoto = new BancoNacion();

        ArrayList<BancoNacion> sucursales = new ArrayList<>();

        sucursales.add(sucursalUrquiza);
        sucursales.add(sucursalPueyrredon);

        sucursalUrquiza.agregarTrabajador(t1);
        sucursalPueyrredon.agregarTrabajador(t2);
        sucursalDevoto.agregarTrabajador(t3);

        sucursalPueyrredon.cantidadTrabajadores();

        for (BancoNacion b : sucursales) {
            Trabajador t = b.empleadoMayorAntiguedad();
            System.out.println(t.getNombre() + " trabaja aca desde " + t.antiguedad());
        }
    }
}
