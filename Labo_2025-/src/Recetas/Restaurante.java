package Recetas;
import java.util.ArrayList;

public class Restaurante {
    private ArrayList<Receta> recetas;

    public Restaurante(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }
    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }

    public void agregarReceta(Receta nuevaReceta) {
        recetas.add(nuevaReceta);
    }
    public void borrarReceta(Receta viejaReceta) {
        recetas.remove(viejaReceta);
    }
    public void modificarReceta(Receta nuevaReceta, Receta viejaReceta) {
        recetas.remove(viejaReceta);
        recetas.add(nuevaReceta);
    }

    public ArrayList<Receta> filtraPorDificultad(Dificultad dificultad) {
        ArrayList<Receta> filtradas = new ArrayList<>();
        for (Receta r : recetas) {
            if (r.getDificultad() == dificultad) {
                filtradas.add(r);
            }
        }
        return filtradas;
    }

    public ArrayList<Receta> filtrarRecetasPorTipo(Receta receta) {
        ArrayList<Receta> resultado = new ArrayList<>();
        for (Receta r : recetas) {
            if (r.esDelTipo(receta)) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    public int cantidadRecetas() {
        return recetas.size();
    }

    public Receta recetaConMasPasos() {
        Receta recetaMasPasos = recetas.get(0);
        for (Receta r : recetas) {
            if (recetaMasPasos.getListaPasos().size() < r.getListaPasos().size()) {
                recetaMasPasos = r;
            }
        }
        return recetaMasPasos;
    }


    public static void main(String[] args) {
    }
}