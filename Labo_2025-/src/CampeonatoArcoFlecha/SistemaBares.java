package CampeonatoArcoFlecha;
import java.util.HashSet;

public class SistemaBares {
    private HashSet<Bar> bares;
    private HashSet<Diana> dianas;
    private HashSet<Beneficio> beneficios;

    public Diana dianaMasPuntajes(){
        Diana dMasPuntaje = null;
        int puntajemaximo = -1
        for (Diana d : dianas) {
            int cantidadPuntajes = d.getPuntajeColor().size();
            if (cantidadPuntajes > puntajeMaximo) {
                puntajeMaximo = cantidadPuntajes;
                dMasPuntaje = d;
            }
        }

        return dMasPuntaje;
    }

    public static void main(String[] args) {
            SistemaBares sistema = new SistemaBares();

            // Crear puntajes para dianas
            HashMap<Integer, ColorDiana> puntajes1 = new HashMap<>();
            puntajes1.put(10, ColorDiana.ROJO);
            puntajes1.put(8, ColorDiana.AMARILLO);

            HashMap<Integer, ColorDiana> puntajes2 = new HashMap<>();
            puntajes2.put(10, ColorDiana.ROJO);
            puntajes2.put(8, ColorDiana.AMARILLO);
            puntajes2.put(5, ColorDiana.VERDE);

            // Crear dianas
            Diana dCuadrada = new DianaCuadrada("D1", Dificultad.FACIL, puntajes1, 50);
            Diana dRectangular = new DianaRectangular("D2", Dificultad.INTERMEDIO, puntajes2, 40, 60);
            Diana dCircular = new DianaCircular("D3", Dificultad.DIFICIL, puntajes1);

            sistema.dianas.add(dCuadrada);
            sistema.dianas.add(dRectangular);
            sistema.dianas.add(dCircular);

            // Crear beneficios
            HashSet<ComidasBeneficio> comidas = new HashSet<>();
            ComidasBeneficio comida1 = new ComidasBeneficio("Hamburguesa", "Chef1", 5000, comidas);
            sistema.beneficios.add(comida1);

            HashSet<String> gaseosasSet = new HashSet<>();
            gaseosasSet.add("Coca");
            gaseosasSet.add("Pepsi");
            GaseosasBeneficio gaseosa1 = new GaseosasBeneficio("Promo Gaseosa", "Bar1", gaseosasSet, 2000);
            sistema.beneficios.add(gaseosa1);

            HashSet<TragosBeneficio> tragos = new HashSet<>();
            TragosBeneficio trago1 = new TragosBeneficio(1500, tragos);
            sistema.beneficios.add(trago1);

            // Crear clientes
            Cliente cliente1 = new Cliente("Juan", "Perez", 12345678);
            Cliente cliente2 = new Cliente("Ana", "Lopez", 87654321);

            // Crear bar
            HashSet<Diana> dianasBar = new HashSet<>();
            dianasBar.add(dCuadrada);
            dianasBar.add(dRectangular);

            HashSet<Cliente> clientesBar = new HashSet<>();
            clientesBar.add(cliente1);
            clientesBar.add(cliente2);

            HashSet<TragosBeneficio> tragosBar = new HashSet<>();
            tragosBar.add(trago1);

            HashSet<Beneficio> beneficiosBar = new HashSet<>();
            beneficiosBar.add(comida1);
            beneficiosBar.add(gaseosa1);

            Bar bar1 = new Bar(dianasBar, clientesBar, tragosBar, beneficiosBar, 10000);
            sistema.bares.add(bar1);

            // Probar métodos
            System.out.println("Diana con más puntajes: " + sistema.dianaMasPuntajes().getId());

            System.out.println("Dinero recaudado en el bar: " + bar1.getDineroRecaudado());
            System.out.println("Cantidad de tragos disponibles: " + bar1.tragosDisponibles());
            System.out.println("Cantidad total de puntajes en dianas del bar: " + bar1.cantidadPuntajesDiana());

            System.out.println("Precio con descuento comida: " + comida1.aplicarDescuentoExtra());
            System.out.println("Precio con descuento gaseosa: " + gaseosa1.aplicarDescuentoExtra());
            System.out.println("Precio con descuento trago: " + trago1.aplicarDescuentoExtra());

            System.out.println("Área Diana Cuadrada: " + dCuadrada.calcularArea());
            System.out.println("Área Diana Rectangular: " + dRectangular.calcularArea());
            System.out.println("Área Diana Circular: " + dCircular.calcularArea());
        }
    }

}
