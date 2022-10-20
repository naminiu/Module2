package LopVaDoiTuongTrongJava;

public class THStaticMethod {
     int id = 0;
    private String name;
    private static String collage = "Ban Đầu" ;
    static int count = 0;

    public THStaticMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public  THStaticMethod (String name){

        this.name = name;
        this.id = ++count;
    }

    public THStaticMethod() {
    }

    public static void change(){
        collage = "Codegym";
    }
     public String display(){
        return this.id + ": " + this.name + " " + collage + count;
    }

    public static void main(String[] args) {
        THStaticMethod.change();
        THStaticMethod student = new THStaticMethod("Hoang");
        System.out.println(student.display());
        THStaticMethod student1 = new THStaticMethod("Tran");
        System.out.println(student1.display());
        THStaticMethod student2 = new THStaticMethod("Nhat");
        System.out.println(student2.display());
        System.out.println(student.display());





    }
}

