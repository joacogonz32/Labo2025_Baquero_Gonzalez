package Elecciones_Octubre;

import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajadores implements Mensajero{
    private String nombre;
    private String apellido;
    private int dni;
    private int cuil;
    private LocalDate fechaNacimiento;
    private double sueldo;
    private String direccion;
    private LocalTime inicioTrabajo;
    private LocalTime finTrabajo;

    @Override
    public void enviarMensaje(String mensaje) {
        if (LocalTime.now().isBefore(finTrabajo) && LocalTime.now().isAfter(inicioTrabajo)){
            System.out.println("Yo, " + nombre + " " + apellido + ", te invito a que ");
        }
    }
}
