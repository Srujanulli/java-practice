package Day_1;

public class ElectricCar extends Car{
    public double batteryPercentage;

    public ElectricCar(String brand,
                       String model,
                       String fuelType,
                       double batteryPercentage){

        super(brand,model,fuelType);
        this.batteryPercentage=batteryPercentage;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("BatteryPercentage:"+batteryPercentage+"%");
    }
}
