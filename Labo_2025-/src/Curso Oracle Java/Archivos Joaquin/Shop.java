package objetos;
import persona.Customer;
public class ShopApp{
    public static void main(String[] args) {
        double total = 0.0, tax = 0.2;
        int measurement = 8;
        System.out.println("¡Welcome to the Duck Shop!");
        Customer customer1 = new Customer("Pinky", 10);

        // c1.setName("Pinky");
        //c1.setSize("S")

        Clothing item1 = new Clothing(30.0,"Blue Jacket", "M");
        Clothing item2 = new Clothing(15.7,"Orange T-Shirt", "S");
        Clothing[] items = {item1, item2, new Clothing(5, "Green Scarf", "S"), new Clothing(15.5, "Blue T-Shirt", "S")};

        //System.out.println(item1.getDescription() + ", " + item1.getSize() + ", " + item1.getPrice());
        //System.out.println(item2.getDescription() + ", " + item2.getSize() + ", " + item2.getPrice());

        customer1.addItems(items);
        //customer1.setSize(measurement);
        System.out.println("Customer 1: " + customer1.getName() + ", " + customer1.getSize() +  ", "+ customer1.getTotalClothingCost());
        for(Clothing item : customer1.getItems()){
            System.out.println(item.getDescription());
        }


    }
}
