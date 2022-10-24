package abstractClassAndInterface.THHeCacDoiTuongHinhHoc;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSize() {
        return getWidth();
    }
    public void setSize(double size) {
        setWidth(size);
        setLength(size);
    }

    @Override
    public void setWidth(double length) {
        setSize(length);
    }

    @Override
    public void setLength(double length) {
        setSize(length);
    }


    public String toString(){
        return "A Square with side = "
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }
}
