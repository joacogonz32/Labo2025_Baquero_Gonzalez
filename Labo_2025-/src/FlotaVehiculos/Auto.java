package FlotaVehiculos;

public class Auto extends Vehiculo{
    private boolean descapotable;

    public Auto(String marca, String modelo, String color, int cantRuedas, int anioFabricacion, boolean descapotable) {
        super(marca, modelo, color, cantRuedas, anioFabricacion);
        this.descapotable = descapotable;
    }
    public Auto(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}
