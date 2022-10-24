package abstractClassAndInterface.THLopAnimalVainterfaceEdible;

public class Chicken extends Animal implements Edible{
    public Chicken() {
    }
    public String makeSound(){
        return "ò ó o";
    }

    @Override
    public String howToEat() {
        return "mổ mổ";
    }
}
