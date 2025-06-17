package Recetas;
import java.util.ArrayList;
import Recetas.Dificultad;
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
        ArrayList<Receta> encontradas = new ArrayList<>();
        for (Receta r : recetas) {
            if (r.getDificultad() == dificultad) {
                encontradas.add(r);
            }
        }
        return encontradas;
    }

    public int cantidadRecetas() {
        return recetas.size();
    }

    public Receta recetaConMasPasos() {
        Receta recetamaspasos = recetas.get(0);
        for (Receta r : recetas) {
            if (recetamaspasos.getListaPasos().size() < r.getListaPasos().size()) {
                recetamaspasos = r;
            }
        }
        return recetamaspasos;
    }
    public void filtrarPorReceta(Receta receta){
        for (Receta r : recetas){
            if(r.getTipo() == receta.getTipo()){
                System.out.println(r.mostrarReceta());
            }
        }
    }


    public static void main(String[] args) {
        // Crear pasos para recetas
        ArrayList<String> pasosPizza = new ArrayList<>();
        pasosPizza.add("Preparar la masa");
        pasosPizza.add("Agregar salsa");
        pasosPizza.add("Agregar queso");
        pasosPizza.add("Hornear");

        ArrayList<String> pasosEnsalada = new ArrayList<>();
        pasosEnsalada.add("Lavar vegetales");
        pasosEnsalada.add("Cortar ingredientes");

        ArrayList<String> pasosTarta = new ArrayList<>();
        pasosTarta.add("Hacer la masa");
        pasosTarta.add("Preparar el relleno");
        pasosTarta.add("Unir masa y relleno");
        pasosTarta.add("Hornear");
        pasosTarta.add("Dejar enfriar");

        PlatoPrincipal pizza = new PlatoPrincipal(pasosPizza, Dificultad.INTERMEDIA);
        Entrada ensalada = new Entrada(pasosEnsalada, Dificultad.FACIL);
        Postre torta = new Postre(pasosTarta, Dificultad.DIFICIL);

        ArrayList<Receta> lista = new ArrayList<>();
        Restaurante restaurante = new Restaurante(lista);

        restaurante.agregarReceta(pizza);
        restaurante.agregarReceta(ensalada);
        restaurante.agregarReceta(torta);

        System.out.println("Cantidad de recetas: " + restaurante.cantidadRecetas());

    }
}