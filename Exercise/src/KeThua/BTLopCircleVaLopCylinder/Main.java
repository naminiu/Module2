package KeThua.BTLopCircleVaLopCylinder;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1, "blue");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(5, 3, "Red");
        System.out.println(cylinder);
//        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        int[] cities = {122, 2, 333, 41};
        java.util.Arrays.sort(cities);
        System.out.println(cities[0]);
//        for (int city : cities)
//            System.out.print(city + " ");

        BigInteger[] hugeNumbers = {new BigInteger("123")};
        System.out.println(hugeNumbers[0]);



    }
}
