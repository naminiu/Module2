package abstractClassAndInterface.THTrienKhaiinterfaceComparable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        ComparableCircle comparableCircle = new ComparableCircle(5);
//        ComparableCircle comparableCircle1 = new ComparableCircle(5);
//
//        System.out.println(comparableCircle.compareTo(comparableCircle1));

//        System.out.println(circles.compareTo(circles3));
        ComparableCircle[] circles = new ComparableCircle[4];
        circles[0] = new ComparableCircle(3);
        circles[1] = new ComparableCircle(1);
        circles[2] = new ComparableCircle(6);
        circles[3] = new ComparableCircle(2);
        Arrays.sort(circles);

        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }

        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }

    }
}
