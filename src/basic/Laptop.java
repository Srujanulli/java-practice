package basic;

class Laptop{

    String brand;
    int ram;
    int price;

    Laptop(String brand,int ram,int price){
        this.brand=brand;
        this.ram=ram;
        this.price=price;
    }

    void upgradeRam(int upgrade){
        this.ram += upgrade;
    }

    void showSpecs(){
        System.out.println(brand);
        System.out.println(ram+"GB");
        System.out.println(price);
    }

    public static void main(String[] args){

        Laptop l1=new Laptop("lenovo",8,30000);
        Laptop l2=new Laptop("HP",16,50000);
        Laptop l3=new Laptop("Asus",8,45000);

        l1.upgradeRam(8);
        l2.upgradeRam(4);
        l1.showSpecs();
        l2.showSpecs();
        l3.showSpecs();
    }
}