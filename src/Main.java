import Day_1.Car;
import Day_1.ElectricCar;
import Day_1.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Volvo", "X1");

        Vehicle v2 = new Car(
                "Toyota",
                "Corolla",
                "Petrol"
        );

        Vehicle v3 = new ElectricCar(
                "Tesla",
                "Model 3",
                "Electric",
                85
        );

        System.out.println("Vehicle:");
        v1.displayInfo();

        System.out.println();

        System.out.println("Car:");
        v2.displayInfo();

        System.out.println();

        System.out.println("Electric Car:");
        v3.displayInfo();
    }
}