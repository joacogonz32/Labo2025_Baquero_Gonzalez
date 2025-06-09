package TiendaElectronicos;
import TiendaElectronicos.*;

import java.util.ArrayList;

public class SistemaTienda {
    private ArrayList<Producto> dispositivos;

    public void agregarDispositivo(Producto dispositivo){
        dispositivos.add(dispositivo);
    }
    public void eliminarDispositivo(Producto dispositivo){
        dispositivos.remove(dispositivo);
    }
    public void modificarDispositivo(Producto dispositivoBorrar, Producto dispositivoNuevo){
        eliminarDispositivo(dispositivoBorrar);
        agregarDispositivo(dispositivoNuevo);
    }
    public int menorStock() {
        int stockMenor = dispositivos.get(0).getStock();
        for (int i = 1; i < dispositivos.size(); i++) {
            if (stockMenor > dispositivos.get(i).getStock()) {
                stockMenor = dispositivos.get(i).getStock();
            }
        }

        return stockMenor;
    }

    public int mayorStock() {
        int stockMayor = dispositivos.get(0).getStock();
        for (int i = 1; i < dispositivos.size(); i++) {
            if (stockMayor < dispositivos.get(i).getStock()) {
                stockMayor = dispositivos.get(i).getStock();
            }
        }

        return stockMayor;
    }

    

    public static void main(String[] args) {

    }
}
