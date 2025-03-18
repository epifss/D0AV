package oop;

public class Product{
    public double quantity;
    public String name;
    public double price;



    public void addQuantity(double quantity) {
        this.quantity += quantity;
    }
    public void subtractQuantity(double quantity) {
        this.quantity -= quantity;
    }

    public double calculaTotalValue() {
        return this.quantity * this.price;
    }
    public String toString() {

        return "produto: "
                + name
                + " quantidade: "
                + quantity
                + " preço: R$"
                +String.format("%.2f",price)
                +" estoque: R$"
                +String.format("%.2f%n",calculaTotalValue());
    }
}

