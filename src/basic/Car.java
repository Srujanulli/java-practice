package basic;

public class Car {
    private String brand;
    private int speed;

    Car(String brand,int speed){
        this.brand= brand;
        this.speed=speed;
    }
    void displayInfo(){
        System.out.println("Brand:"+brand);
        System.out.println("Speed:"+speed);
    }

    public static void main(String[] args) {
        Car c1= new Car("BMW",30);
        Car c2= new Car("Benz",45);
        Car c3= new Car("Toyota",45);
        c1.displayInfo();
        System.out.println();
        c2.displayInfo();
        System.out.println();
        c3.displayInfo();
    }
}
