package objetos;

public class Clothing {
    private String description;
    private double price;
    private String size="M";
    public final static double MIN_PRICE = 10.0; // en el curso los hace publicos
    public final static double TAX_RATE = 0.2;

    /*
    public static double getMinPrice(){
        return MIN_PRICE;
    }
    public static double getTaxRate(){
        return TAX_RATE;
    }
*/

//CONTRSUCTOR
    public Clothing(double price, String description, String size) {
        this.price = price;
        this.description = description;
        this.size = size;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price + (price * TAX_RATE);
    }
    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price:MIN_PRICE;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public String toString(){
        return getDescription() + "," + getSize() + "," +getPrice();
    }

}
