package Day_1;

public class Dog extends Animal{
    Dog(String Name) {
        super(Name);
    }

    @Override
    void makeSound(){
        System.out.println("Bark");
    }
}
