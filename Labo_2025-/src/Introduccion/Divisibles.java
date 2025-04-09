package Unidad1;

public class Divisibles {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i%2 == 0 && i%3 == 0){
                System.out.println(i+ " es divisible");
            }
            else{
                System.out.println(i+" no es divisible");
            }
        }
    }
}
