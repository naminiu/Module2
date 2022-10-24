package KeThua.TestOverriding;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog");
        animal.eat();
        Dog dog = new Dog("Cogri");
        dog.eat();
    }
}
