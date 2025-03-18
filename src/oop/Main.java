package oop;

public class Main {
    public static void main(String[] args) {
        Product TV = new Product();
        TV.quantity=10;
        TV.price=900;
        TV.name="TV";
        System.out.println(TV);
        TV.addQuantity(5);
        System.out.println(TV);
        TV.subtractQuantity(3);
        System.out.println(TV);
    }
}