package Curso_Oracle_Java.Archivos_Juanpi.objetos;

public class ShopApp{
    public static void main(String[] args) {
        double total = 0.0, tax = 0.2;
        int measurement = 8;
        System.out.println("¡Bienvenidos a la duck Shop!");
        persona.Customer2 customer1 = new persona.Customer2("Piny", 10);

        // c1.setName("Pinky");
        //c1.setSize("S")

        Clothing item1 = new Clothing(20.9,"Campera Azul", "M");
        Clothing item2 = new Clothing(10.5,"Remera Naranja", "S");
        Clothing[] items = {item1, item2, new Clothing(5, "Bufanda verde", "S"), new Clothing(10.5, "Remera Azul", "S")};

        //System.out.println(item1.getDescription() + ", " + item1.getSize() + ", " + item1.getPrice());
        //System.out.println(item2.getDescription() + ", " + item2.getSize() + ", " + item2.getPrice());

        customer1.addItems(items);
        //customer1.setSize(measurement);
        System.out.println("Customer : " + customer1.getName() + " " + customer1.getSize() +  ", "+ customer1.getTotalClothingCost());
        for(Clothing item : customer1.getItems()){
            System.out.println(item.getDescription());
        }


    }
}
