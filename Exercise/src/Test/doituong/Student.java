package Test.doituong;

public class Student {
    private String name;
    private int age;
    private float height;
    public static String uni = "Hue";
    public static int total = 0;



    public Student(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        total +=1;
    }

}
