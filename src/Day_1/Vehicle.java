package Day_1;

public class Vehicle {
    String brand;
    String model;

    public Vehicle(String brand,String model){
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo(){
        System.out.println("Brand Name:"+brand);
        System.out.println("Model Name:"+ model);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Volvo","x1");
        v.displayInfo();
    }
}
