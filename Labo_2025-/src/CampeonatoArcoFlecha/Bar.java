package CampeonatoArcoFlecha;
import java.util.HashSet;

public class Bar {
    private HashSet<Diana> dianasUsadas;
    private HashSet<Cliente> clientesJuegan;
    private HashSet<TragosBeneficio> tragosBar;
    private HashSet<Beneficio> beneficiosAcumulables;
    private double dineroRecaudado;

    public Bar(HashSet<Diana> dianasUsadas, HashSet<Cliente> clientesJuegan, HashSet<TragosBeneficio> tragosBar, HashSet<Beneficio> beneficiosAcumulables, double dineroRecaudado) {
        this.dianasUsadas = dianasUsadas;
        this.clientesJuegan = clientesJuegan;
        this.tragosBar = tragosBar;
        this.beneficiosAcumulables = beneficiosAcumulables;
        this.dineroRecaudado = dineroRecaudado;
    }

    public HashSet<Diana> getDianasUsadas() {return dianasUsadas;}
    public void setDianasUsadas(HashSet<Diana> dianasUsadas) {this.dianasUsadas = dianasUsadas;}
    public HashSet<Cliente> getClientesJuegan() {return clientesJuegan;}
    public void setClientesJuegan(HashSet<Cliente> clientesJuegan) {this.clientesJuegan = clientesJuegan;}
    public HashSet<TragosBeneficio> getTragosBar() {return tragosBar;}
    public void setTragosBar(HashSet<TragosBeneficio> tragosBar) {this.tragosBar = tragosBar;}
    public HashSet<Beneficio> getBeneficiosAcumulables() {return beneficiosAcumulables;}
    public void setBeneficiosAcumulables(HashSet<Beneficio> beneficiosAcumulables) {this.beneficiosAcumulables = beneficiosAcumulables;}
    public double getDineroRecaudado() {return dineroRecaudado;}
    public void setDineroRecaudado(double dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public int tragosDisponibles(){
        return tragosBar.size();
    }

    public int cantidadPuntajesDiana(){
        int contador = 0;
        for (Diana d : dianasUsadas){
            for (Integer key : d.getPuntajeColor().keySet()){
                contador++;
            }
        }
        return contador;
    }

}
