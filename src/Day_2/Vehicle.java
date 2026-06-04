package Day_2;

public class Vehicle {
    String brand;
    String model;

    public Vehicle(String brand,String model){
        this.brand=brand;
        this.model=model;
    }

    public void describe(){
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
    }
}
