package Day_1;

public class Product implements Displayable {
    public String name;
    public double price;
    double discount=0;

    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }

    public void displayProduct(){
        System.out.println("Name:"+name);
        System.out.println("Price:"+price);
    }

    public void applydiscount(double discount){
        if (discount>=0 && discount<=100){
            price = price * (1 - discount / 100);
        }
    }

    @Override
    public void display() {
        displayProduct();
    }

    public static void main(String[] args) {
        Product p = new Product("Pen",100);
        p.displayProduct();
        p.applydiscount(70);
        p.display();
    }
}
