package Day_1;

public class Cat extends Animal{
    Cat(String Name){
        super(Name);
    }
    @Override
    void makeSound(){
        System.out.println("meow");
    }
}
