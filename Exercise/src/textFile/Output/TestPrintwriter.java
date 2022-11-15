package textFile.Output;

import java.io.BufferedWriter;
import java.io.FileWriter;
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
            FileWriter fw = new FileWriter("G:/Module2/BaiTap/Exercise/src/textFile/outfile/testprintWriter.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
//            System.out.println("Nhập tuổi: ");
//            int a = Integer.parseInt(scanner.nextLine());
//            System.out.println("Nhập tên");
//            String b = scanner.nextLine();
//            TestPrintwriter student = new TestPrintwriter(a, b);
//            pw.print(student);
            pw.write("123");
            pw.flush();
            pw.close();
        } catch (Exception a) {
            a.printStackTrace();
        }
    }
}
