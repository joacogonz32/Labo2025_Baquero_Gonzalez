package LlamadasTelefonicas;

public class Empleado {
    private String nombre;
    private String apellido;
    private int dni;
    private String pais;
    private int telefono;

    public Empleado(String nombre, String apellido, int dni, String pais, int telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pais = pais;
        this.telefono = telefono;
    }

    public Empleado(){
        this.nombre = "Joaquin";
        this.apellido = "Gonzalez";
        this.dni = 48521023;
        this.pais = "Argentina";
        this.telefono = 1152748891;
    }

    public String getNombre(){ return nombre; }
    public String getApellido(){ return apellido; }
    public int getDni(){ return dni; }
    public String getPais(){ return pais; }
    public int getTelefono(){ return telefono; }

    public void setNombre(String nombre){ this.nombre = nombre; }
    public void setApellido(String apellido){ this.apellido = apellido; }
    public void setDni(int dni){ this.dni = dni; }
    public void setPais(String pais){ this.pais = pais; }
    public void setTelefono(int telefono){ this.telefono = telefono; }

}
