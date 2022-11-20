package Test.doituong;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("hoang", 18, 1.65f);
        System.out.println(" uni class" + Student.uni);
        System.out.println(" uni ins" + st1.uni);
        System.out.println(" total class" + Student.total);

        Student st2 = new Student("tran", 18, 1.65f);
        System.out.println("total inst" + st2.total);
        System.out.println(" total class" + Student.total);


    }
}
