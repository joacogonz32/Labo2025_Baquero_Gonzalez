package objetos;
import personas.Customer;
import objetos.Clothing;
public class Shop {

    public static void main(String[] args) {
        double tax = 0.21;
        double total;
        Customer c1 = new Customer();
        c1.setName("Carlos");
        System.out.println("Hola" + c1.getName());
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-shirt", 10.5, "S");
        System.out.println("Item 1 datos: " + item1.getDescription() + " " + item1.getPrice() + " " + item1.getSize());
        System.out.println("Item 2 datos: " + item2.getDescription() + " " + item2.getPrice() + " " + item2.getSize());
        total = ((item2.getPrice()*2)+item1.getPrice())*(1+tax);
        System.out.println(total);

          
        }
    }
