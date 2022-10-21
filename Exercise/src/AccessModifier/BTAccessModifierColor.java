package AccessModifier;

public class BTAccessModifierColor {
    private double radius = 1;
    private String color = "red";

    BTAccessModifierColor() {
    }

    BTAccessModifierColor(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {

    }
}

