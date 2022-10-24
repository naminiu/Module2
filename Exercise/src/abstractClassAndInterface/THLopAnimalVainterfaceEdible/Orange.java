package abstractClassAndInterface.THLopAnimalVainterfaceEdible;

public class Orange extends Fruit{
    public Orange() {
    }

    @Override
    public String howToEat() {
        return "Orance could be juiced";
    }

    @Override
    public String howMuchsuger() {
        return "3 spoon";
    }
}
