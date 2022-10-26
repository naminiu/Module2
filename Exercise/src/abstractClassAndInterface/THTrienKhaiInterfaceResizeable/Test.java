package abstractClassAndInterface.THTrienKhaiInterfaceResizeable;

public class Test {
    public static void main(String[] args) {
//        int x = (int) Math.floor(Math.random() *10);
//        System.out.println(x);

        Shape[] shape = new Shape[5];
        shape[0] = new Circle(1);
        shape[1] = new Rectangle(1, 2);
        shape[2] = new Square(1);
        shape[3] = new Circle(4);
        shape[4] = new Square(5);

        for (Shape item : shape) {
            if (item instanceof Circle) {
                System.out.println(item);
                double percent = Math.floor(Math.random() * (100 - 1) + 1);
                System.out.println(percent);
                    ((Circle) item).resize(percent);
                System.out.println(item);
            } else if (item instanceof Square){
                System.out.println(item);
                double percent = Math.floor(Math.random() * (100 - 1) + 1);
                System.out.println(percent);
                ((Square) item).resize(percent);
                System.out.println(item);
            } else{
                System.out.println(item);
                double percent = Math.floor(Math.random() * (100 - 1) + 1);
                System.out.println(percent);
                ((Rectangle) item).resize(percent);
                System.out.println(item);
            }
        }
    }
}
