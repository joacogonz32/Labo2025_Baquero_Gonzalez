package ControlCalorias;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Persona_comida {

    private String nombre;
    private LocalDate fechaNacimiento;
    private HashMap<Plato_calorias,Integer> platosConsumidos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public HashMap<Plato_calorias, Integer> getPlatosConsumidos() {
        return platosConsumidos;
    }

    public void setPlatosConsumidos(HashMap<Plato_calorias, Integer> platosConsumidos) {
        this.platosConsumidos = platosConsumidos;
    }

    public Persona_comida(String nombre, LocalDate fechaNacimiento, HashMap<Plato_calorias, Integer> platosConsumidos) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.platosConsumidos = platosConsumidos;
    }
    public void agregarPlatoConsumido(Plato_calorias plato, int cantidad){
        platosConsumidos.put(plato,cantidad);
    }
    public double cantidadTotalConsumida(){
        double caloriasTotales = 0;;
        for(Map.Entry<Plato_calorias,Integer> calorias : platosConsumidos.entrySet()){
            caloriasTotales += calorias.getKey().calcularCalorias() * calorias.getValue();
        }
        return caloriasTotales;
    }
}
