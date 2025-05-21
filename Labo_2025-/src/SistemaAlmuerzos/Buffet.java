package SistemaAlmuerzos;
import java.time.LocalDate;
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

    public ArrayList<Pedido> porCocinarHoy(ArrayList<Pedido> pedidos){
        ArrayList<Pedido> pedidosHoy = new ArrayList<>();
        for (Pedido p : pedidos){
            if (p.getFechaCreado() == LocalDate.now()){
                pedidosHoy.add(p);
            }
        }
        return pedidosHoy;
    }

    public ArrayList<Pedido> top3masPedidos() {
        ArrayList<Pedido> top3 = new ArrayList<>();
        for (Pedido p1 : pedidos) {
            for (Plato p2 : p1.getPlatoPedido()) {
                if (pedidos.contains(p1.getPlatoPedido())) {

                }
            }
        }
        System.out.println("Top 3 platos más pedidos:" +
                "Top 1: " + platoTop1"- " + "Top 2: " + platoTop2 + "- " + "Top 3: " + platoTop3);
    }




    public static void main(String[] args) {

    }
}
