package KeThua.BTLopCircleVaLopCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height,float r, String color) {
        super(r, color);
        this.height = height;
    }

    public Cylinder(double r, String color, double height) {
        super(r, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getCylinderVolume(){
        return (super.getArea())*height;
    }

    @Override
    public String toString() {
        return "getCylinder Volume is = " + getCylinderVolume() + ", has r is  = " + super.getR() + ", color = " + super.getColor();
    }
}
