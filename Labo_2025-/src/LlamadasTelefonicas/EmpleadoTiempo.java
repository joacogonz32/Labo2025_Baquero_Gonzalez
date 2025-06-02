package LlamadasTelefonicas;

public class EmpleadoTiempo extends Empleado {
    private int tiempoExterior;

    public EmpleadoTiempo(String nombre, String apellido, int dni, String pais, int telefono) {
        super(nombre, apellido, dni, pais, telefono);
        this.tiempoExterior = 0;
    }



}
