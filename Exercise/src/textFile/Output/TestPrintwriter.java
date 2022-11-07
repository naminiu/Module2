package textFile.Output;

import java.io.PrintWriter;
import java.util.Scanner;

public class TestPrintwriter {
    private int age;
    private String name;

    public TestPrintwriter(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter("G:/Module2/BaiTap/Exercise/src/textFile/outfile/testprintWriter.txt");

            printWriter.println(1);
            printWriter.print("Hoang");
            printWriter.print(" ");
            printWriter.print('a');
            printWriter.print(" ");
            printWriter.print("true");
            printWriter.println(" ");
            System.out.println("Nhập tuổi: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên");
            String b = scanner.nextLine();
            TestPrintwriter student = new TestPrintwriter(a, b);
            printWriter.print(student);
            printWriter.flush();
            printWriter.close();
        } catch (Exception a) {
            a.printStackTrace();
        }

    }
}
