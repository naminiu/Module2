package abstractClassAndInterface.TestEquals;

public class Main {
    public static void main(String[] args) {
//        Tạo đối tượng từ lớp khác
//        Test s1 = new Test("123");
//        Test s2 = new Test("123");
//        System.out.println("s1 == s2: " + (s1 == s2));
//        System.out.println("s1.equals(s2): " + (s1.equals(s2)));

        // Tạo ra đối tượng trực tiếp
//        String s1 = new String("This is a string");
//        String s2 = new String("This is a string");
//        System.out.println("s1 == s2: " + (s1 == s2));
//        System.out.println("s1.equals(s2): " + (s1.equals(s2)));

        SinhVien sinhVien1 = new SinhVien("Hoang");
        SinhVien sinhVien2 = new SinhVien("Hoang");
        SinhVien sinhVien3 = new SinhVien("Tran");

        System.out.println(sinhVien1 == sinhVien2);
        System.out.println(sinhVien1 == sinhVien3);
        System.out.println(sinhVien1.equals(sinhVien2));
        System.out.println(sinhVien1.equals(sinhVien3));

    }
}
