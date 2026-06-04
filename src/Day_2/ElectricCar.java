package Day_2;

public class ElectricCar extends Car{
    double batteryPercentage;
    public ElectricCar(String brand,String model,String fuelType,double batteryPercentage){
        super(brand, model, fuelType);
        this.batteryPercentage = batteryPercentage;
    }
    
}
