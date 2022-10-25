package abstractClassAndInterface.THTrienKhaiInterfaceResizeable;

public class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public void resize(double percent) {
        this.side = this.side*(percent/100) + this.side ;
    }

    @Override
    public String toString() {
       return "A Square with side = " + this.getSide() + ", which is a class of " + super.toString();

    }
}
