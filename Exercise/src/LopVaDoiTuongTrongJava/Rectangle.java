package LopVaDoiTuongTrongJava;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public String display(){
        return "Rectangle{ width: " + this.width + ", height: " + this.height + "}";
    }
    public double getArea(){
        return this.height + this.width;
    }
    public double getPerimeter(){
        return (this.height + this.height)*2;
    }
}
