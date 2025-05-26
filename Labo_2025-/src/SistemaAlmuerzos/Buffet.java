package SistemaAlmuerzos;
import Unidad1.Persona;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Buffet {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Plato> platos;

    public Buffet(){
        this.pedidos = new ArrayList<>();
    }

    public Buffet(ArrayList<Pedido> pedidos){
        this.pedidos = new ArrayList<>();
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void borrarPedido(Pedido pedido){
        pedidos.remove(pedido);
    }

    public void editarPedido(Pedido nuevoPedido, Pedido viejoPedido){
        pedidos.remove(viejoPedido);
        pedidos.add(nuevoPedido);
    }

    public ArrayList<Pedido> porCocinarHoy(){
        ArrayList<Pedido> pedidosHoy = new ArrayList<>();
        LocalDate hoy = LocalDate.now();

        for (Pedido p : pedidos){
            if (p.getFechaCreado().equals(hoy)){
                pedidosHoy.add(p);
            }
        }
        return pedidosHoy;
    }

    public void mostrarPlatosConDescuentoDePedidosHoy() {
        LocalDate hoy = LocalDate.now();

        for (Pedido p : pedidos){
            if (p.getFechaCreado().equals(hoy)){
                System.out.println("Pedido de: " + p.getSolicitante().getNombre());

                double descuento = 0.0;
                if (p.getSolicitante() instanceof Profesor){
                    descuento = ((Profesor) p.getSolicitante()).getDescuento();
                }

                for (Plato plato : p.getPlatoPedido()){
                    double precioConDescuento = plato.getPrecio() * (1 - descuento);
                    System.out.println(plato.getNombre() + " - Precio con descuento: $" + precioConDescuento);
                }
            }
        }
    }

    public int cantidadVecesPedida(Plato plato){
        int cantidadpedidas=0;
            for(Pedido pedido: this.pedidos){
                if(pedido.getPlatoPedido().contains(plato)){
                    cantidadpedidas++;
                }
            }
        return cantidadpedidas;
    }

    public ArrayList<Plato> top3masPedidos() {
        ArrayList<Plato> todosPlatos = new ArrayList<>();
        for (Pedido p1 : pedidos) {
            todosPlatos.addAll(p1.getPlatoPedido());
        }
        for (int i = 0; i < todosPlatos.size() - 1; i++) {
            for (int j = i + 1; j < todosPlatos.size(); j++) {
                if (cantidadVecesPedida(todosPlatos.get(j)) > cantidadVecesPedida(todosPlatos.get(i))){
                    Plato aux = todosPlatos.get(i);
                    todosPlatos.set(i, todosPlatos.get(j));
                    todosPlatos.set(j, aux);
                }
            }
        }
        ArrayList<Plato> top3 = new ArrayList<>();
        int limite = Math.min(3, todosPlatos.size());
        for (int i = 0; i < limite; i++) {
            top3.add(todosPlatos.get(i));
        }

        return top3;
    }

    public static void main(String[] args) {
        Plato plato1 = new Plato("Milanesa", 1500, 0);
        Plato plato2 = new Plato("Hamburguesa", 2000, 0);
        Plato plato3 = new Plato("Pizza", 1800, 0);
        Plato plato4 = new Plato("Ensalada", 1200, 0);

        // Listas de platos para cada pedido
        ArrayList<Plato> platosPedido1 = new ArrayList<>();
        platosPedido1.add(plato1);
        platosPedido1.add(plato2);

        ArrayList<Plato> platosPedido2 = new ArrayList<>();
        platosPedido2.add(plato2);
        platosPedido2.add(plato3);

        ArrayList<Plato> platosPedido3 = new ArrayList<>();
        platosPedido3.add(plato1);
        platosPedido3.add(plato3);
        platosPedido3.add(plato4);

        // Crear personas (aquí puedes usar Persona o Profesor si tienes esa clase)
        Persona persona1 = new Persona("Juan", "Perez");
        Persona persona2 = new Persona("Ana", "Gomez");

        // Crear pedidos con fecha de hoy
        Pedido pedido1 = new Pedido(platosPedido1, LocalDate.now(), "Pendiente", LocalTime.of(13, 0), persona1);
        Pedido pedido2 = new Pedido(platosPedido2, LocalDate.now(), "Entregado", LocalTime.of(14, 0), persona2);
        Pedido pedido3 = new Pedido(platosPedido3, LocalDate.now(), "Pendiente", LocalTime.of(15, 0), persona1);

        // Crear Buffet y agregar pedidos
        Buffet buffet = new Buffet();
        buffet.agregarPedido(pedido1);
        buffet.agregarPedido(pedido2);
        buffet.agregarPedido(pedido3);

        // Mostrar pedidos que hay que cocinar hoy
        System.out.println("Pedidos para cocinar hoy:");
        ArrayList<Pedido> pedidosHoy = buffet.porCocinarHoy();
        for (Pedido p : pedidosHoy) {
            System.out.println("- Pedido de " + p.getSolicitante().getNombre() + ", platos:");
            for (Plato pl : p.getPlatoPedido()) {
                System.out.println("  * " + pl.getNombre() + " - $" + pl.getPrecio());
            }
        }

        // Mostrar platos con descuento si hay (requiere que Persona o Profesor esté implementado)
        System.out.println("\nPlatos con descuento de pedidos de hoy:");
        buffet.mostrarPlatosConDescuentoDePedidosHoy();

        // Mostrar top 3 platos más pedidos
        System.out.println("\nTop 3 platos más pedidos:");
        ArrayList<Plato> top3 = buffet.top3masPedidos();
        for (int i = 0; i < top3.size(); i++) {
            Plato p = top3.get(i);
            System.out.println((i + 1) + ". " + p.getNombre() + " - Cantidad pedida: " + buffet.cantidadVecesPedida(p));
        }
    }
}
