package Day_2;

public class VehicleDemo {
    public static void main(String[] args) {

                Vehicle v1 = new Vehicle("Honda", "Activa");

                Vehicle v2 = new Car(
                        "Toyota",
                        "Corolla",
                        "Petrol"
                );

                Vehicle v3 = new ElectricCar(
                        "Tesla",
                        "Model 3",
                        "Electric",
                        85.0
                );

                Vehicle[] vehicles = {v1, v2, v3};

                System.out.println("=== Vehicle Information ===");

                for (Vehicle vehicle : vehicles) {
                    vehicle.describe();
                    System.out.println();
                }
            }
}