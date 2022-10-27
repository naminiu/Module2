package Generic;

public class Box<T> {
    private T x;

    public Box(T x) {
        this.x = x;
    }
    public Box(){}

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }
}
