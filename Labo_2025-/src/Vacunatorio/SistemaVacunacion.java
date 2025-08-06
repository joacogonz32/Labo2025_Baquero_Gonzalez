package Vacunatorio;

import java.util.HashMap;
import java.util.HashSet;

public class SistemaVacunacion{
    private HashMap<Integer,Ciudadano> ciudadanosRegistrados;

    public HashMap<Integer, Ciudadano> getCiudadanosRegistrados() {
        return ciudadanosRegistrados;
    }

    public void setCiudadanosRegistrados(HashMap<Integer, Ciudadano> ciudadanosRegistrados) {
        this.ciudadanosRegistrados = ciudadanosRegistrados;
    }

    public SistemaVacunacion(HashMap<Integer, Ciudadano> ciudadanosRegistrados) {
        this.ciudadanosRegistrados = ciudadanosRegistrados;
    }

    public void agregarVacuna(int dniAbuscar, Vacuna vacuna){
        ciudadanosRegistrados.get(dniAbuscar).getVacunasTiene().add(vacuna);
    }

    public void consultarHistorial(int dniAbuscar){
        if(ciudadanosRegistrados.containsKey(dniAbuscar)){
            ciudadanosRegistrados.get(dniAbuscar).imprimirDatos();
        }
    }
    public void filtrarProvincia(){
        HashMap<Provincia,Integer> cantVacunadosPorProvincia = new HashMap<>();
        for (Ciudadano c : ciudadanosRegistrados.values()) {
            if (cantVacunadosPorProvincia.containsKey(c.getProvinciaResidencia())) {
                cantVacunadosPorProvincia.put(c.getProvinciaResidencia(), cantVacunadosPorProvincia.get(c.getProvinciaResidencia()) + 1);
            } else {
                cantVacunadosPorProvincia.put(c.getProvinciaResidencia(), 1);
            }
        }
    }

    public HashSet<Ciudadano> cumpleVacunas(int cant){
        HashSet <Ciudadano> cumplen = new HashSet<>();
        for (Ciudadano c : ciudadanosRegistrados.values()){
            if(c.getVacunasTiene().size() >= cant){
                cumplen.add(c);
            }
        }
        return cumplen;
    }

    public HashSet<Ciudadano> seLaDieron(Vacuna vacuna){
        HashSet <Ciudadano> yasi = new HashSet<>();
        for (Ciudadano c : ciudadanosRegistrados.values()){
            if (c.getVacunasTiene().contains(vacuna)){
                yasi.add(c);
            }
        }
        return yasi;
    }
}
