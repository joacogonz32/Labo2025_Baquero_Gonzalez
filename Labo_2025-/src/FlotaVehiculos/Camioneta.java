package FlotaVehiculos;

public class Camioneta extends Vehiculo {
    private String patente;
    private int carga;
    private int cargaMax;

    public Camioneta(String marca, String modelo, String color, int cRuedas, int anioFabricacion, String patente, int carga, int cargaMax) {
        super(marca, modelo, color, cRuedas, anioFabricacion, patente, carga, cargaMax);
        this.patente = patente;
        this.carga = carga;
        this.cargaMax = cargaMax;
    }
    public Camioneta(){
        super();
        this.patente="AA 984 HT";
        this.carga=50;
        this.cargaMax=80;
    }

    public Camioneta(String patente, int carga) {
        this.patente = patente;
        this.carga = carga;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    public void añadirCarga(int carga){
        if (this.carga+carga >this.cargaMax){
            System.out.println("exediste el limite de peso");
        }
        else{
            this.carga+=carga;
            System.out.println("se añadio la carga correctamente");
        }
    }
}
