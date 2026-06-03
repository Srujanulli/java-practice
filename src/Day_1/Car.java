package Day_1;

public class Car extends Vehicle {

    public String fuelType;

    public Car(String brand, String model,String fuelType) {
        super(brand, model);
        this.fuelType=fuelType;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Fueltype:"+fuelType);
    }
}
