package KeThua.BTThietKeVaTrienKhaiLopTriangle;

import KeThua.THHeCacDoiTuongHinhHoc.Shape;

public class Triangle extends Shape {
    private double size1 = 1;
    private double size2 = 1;
    private double size3 = 1;

    private double height1 = 1;

    public Triangle() {
    }

    public Triangle(double size1, double size2, double size3, double height1) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
        this.height1 = height1;
    }

    public Triangle(double size1, double size2, double size3, double height1, String color, boolean filled) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
        this.height1 = height1;
    }

    public double getHeight1() {
        return height1;
    }

    public void setHeight1(double height1) {
        this.height1 = height1;
    }

    public double getSize1() {
        return size1;
    }

    public double getSize2() {
        return size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    //    tam giác thường: a # b # c  chuvi P = a + b + c Dientich S = 1/2*a*ha
//    tam giác vuông: b2 = a2 + c2 P = a + b + c S = 1/2*a*b
//    tam giác cân: (a = b) # c P = a + b + c S = 1/2*a*ha
//    tam giác đều: a = b = c P = 3*a S = (a*h)/3
    public double getArea() {
        String result = "";
        if (size2 * size2 == (size1 * size1 + size3 * size3)) {
//            "Diện tích của tam giác vuông là: S = " +
            return 0.5 * size1 * size2;
        } else if (size1 == size2 && size1 != size3 && size2 != size3) {
//            "Diện tích của tam giác cân là S = " +
            return 0.5 * size1 * height1;
        } else if (size1 == size2 && size1 == size3 && size2 == size3) {
//            "Diện tích của tam giác đều là " +
            return ((size1 * height1) / 3);
        } else {
//            "Diện tích của tam giác thường là: " +
            return 0.5 * size1 * height1;
        }
    }

    public double getPerimeter() {
        if (size2 * size2 == (size1 * size1 + size3 * size3)) {
//            "chu vi của tam giác vuông là: " +
            return (size1 + size2 + size3);
        } else if (size1 == size2 && size1 != size3 && size2 != size3) {
//            "chu vi tam giác cân là "
            return (size1 + size2 + size3);
        } else if (size1 == size2 && size1 == size3 && size2 == size3) {
//            "chu vi tam giác đều là " +
            return size1 * 3;
        } else {
//            "chu vi của tam giác thường là: " +
            return (size1 + size2 + size3);
        }
    }

    @Override
    public String toString() {
        return "chu vi = " + getPerimeter() + ", diện tích = " + getArea() + ". color = " + super.getColor() + ", filled = " + super.isFilled();
    }
}

