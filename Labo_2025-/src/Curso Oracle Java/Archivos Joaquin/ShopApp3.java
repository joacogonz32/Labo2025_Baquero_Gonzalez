package objetos;
import Seres_Vivos.Customer;
public class ShopApp{
    public static void main(String[] args) {

        double total = 0.0, tax = 0.2;
        int measurement = 8;
        System.out.println("¡Bienvenidos a la duck Shop!");
        Customer customer1 = new Customer("Piny", 10);

        Customer c1 = new Customer("Pinky",14);
        // c1.setName("Pinky");
        //c1.setSize("S")

        System.out.println("Min price: " + Clothing.MIN_PRICE);


        Clothing item1 = new Clothing(20.9,"Campera Azul", "M");
        Clothing item2 = new Clothing(10.5,"Remera Naranja", "S");

        Clothing[] items = {item1, item2, new Clothing(5, "Bufanda verde", "S"), new Clothing(10.5, "Remera Azul", "S")};

        //System.out.println(item1.getDescription() + ", " + item1.getSize() + ", " + item1.getPrice());
        //System.out.println(item2.getDescription() + ", " + item2.getSize() + ", " + item2.getPrice());
        // total = (item1.price + item2.price * 2)*(1 + tax)

        customer1.addItems(items);

        //customer1.setSize(measurement);
        System.out.println("Customer : " + customer1.getName() + " " + customer1.getSize() +  ", "+ customer1.getTotalClothingCost());
        for(Clothing item : customer1.getItems()){
            // System.out.println(item.getDescription("Items " + item.getDescription("Items " + item.getDescription() + "," + item.getSize() + "," + item.getPrice());
            System.out.println("Item output: " + item);
        }



    }
}
