package Generic;

public class TestBox {
    public static void main(String[] args) {
    Box<String> box = new Box<String>("hai");
    Box<Double> box1 = new Box<Double>(1.1);
    Box<Integer> box2 = new Box<Integer>(2);

        System.out.println(box.getX());
        System.out.println(box1.getX());
        System.out.println(box2.getX());


    }
}
