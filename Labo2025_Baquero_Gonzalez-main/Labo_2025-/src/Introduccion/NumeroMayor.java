package Unidad1;

public class NumeroMayor {
    public static void main(String[] args) {
        int var1 = 4;
        int var2 = 5;
        if (var1 > var2) {
            System.out.println(var1 + " es mayor que " + var2);
        }
            else if(var2 > var1){
                System.out.println(var2+" es mayor que "+var1);
        }
            else
            System.out.println(var2+" y "+var1+" son iguales.");
    }
}
