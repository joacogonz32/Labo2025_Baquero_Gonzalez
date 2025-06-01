import java.util.ArrayList;

public class Computadora {
    private CPU cpu;
    private ArrayList<Periferico> perifericos;

    public Computadora(CPU cpu, ArrayList<Periferico> perifericos){
        if (cpu == null) throw new IllegalArgumentException("La PC debe tener CPU");
        boolean tienePuertoEntrada = false;
        boolean tienePuertoSalida = false;
        for (Periferico p : perifericos){
            if (p instanceof Entrada){
                tienePuertoEntrada = true;
            }
            else if (p instanceof Salida) {
                tienePuertoSalida = true;
            }
        }
        if (tienePuertoEntrada && tienePuertoSalida && cpu != null){
            this.cpu = cpu;
            this.perifericos = perifericos;
        }
    }

    public CPU getCpu() {
        return cpu;
    }
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public ArrayList<Periferico> getPerifericos() {
        return perifericos;
    }
    public void setPerifericos(ArrayList<Periferico> perifericos) {
        this.perifericos = perifericos;
    }

    public double calcularPrecioNeto(){
        double suma = cpu.getPrecio();
        for (Periferico p : perifericos){
            suma += p.getPrecio();
        }
        return suma;
    }

    public void actualizarStock() {
        cpu.reducirStock(1);
        for (Periferico p : perifericos) p.reducirStock(1);
    }

    /* Forma facil de hacerlo (Repite codigo)
    public int cantidadDispositivosEntrada(){
        int contador = 0;
        for (Periferico p : perifericos){
            if (p instanceof Entrada){
                contador++;
            }
        }
        return contador;
    }

    public int cantidadDispositivosSalida(){
        int contador = 0;
        for (Periferico p : perifericos){
            if (p instanceof Salida){
                contador++;
            }
        }
        return contador;
    } */

    // Forma mas compleja (No repite codigo)
    public int cantidadDispositivos (String tipoDispositivo){
        int contador =0;
        for(Periferico p: perifericos){
            if (p.getClass().getCanonicalName().equals(tipoDispositivo)){
                contador++;
            }
        }
        return contador;
    }

}
