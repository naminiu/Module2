package abstractClassAndInterface.THLopAnimalVainterfaceEdible;

public class Test {
    public static void main(String[] args) {
//        Chicken chicken = new Chicken();
//        System.out.println("Chicken: " + chicken.makeSound());
//        Tiger tiger = new Tiger();
//        System.out.println("Tiger: " + tiger.makeSound());
//

//        Apple apple = new Apple();
//        System.out.println("Apple: " + apple.howToEat());
//        Orange orange = new Orange();
//        System.out.println("Orange " + orange.howToEat());

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
//            System.out.println(animal.makeSound());
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for(Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }

    }
}


