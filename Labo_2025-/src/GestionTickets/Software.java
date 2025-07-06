package GestionTickets;

public class Software {
    private String nombre;
    private boolean tiene_parche;

    public Software(String nombre, boolean tiene_parche) {
        this.nombre = nombre;
        this.tiene_parche = tiene_parche;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public boolean isTiene_parche() {return tiene_parche;}
    public void setTiene_parche(boolean tiene_parche) {this.tiene_parche = tiene_parche;}


}
