package LopVaDoiTuongTrongJava;

public class BTXayDungLopChiGhiTrongJavaStudent {
    private String name = "Join";
    private String classes = "C02";

    public BTXayDungLopChiGhiTrongJavaStudent() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public static void main(String[] args) {
        BTXayDungLopChiGhiTrongJavaStudent student = new BTXayDungLopChiGhiTrongJavaStudent();
        student.setName("Hoang");
        System.out.println(student.getName());
        student.setClasses("C0822G1");
        System.out.println(student.getClasses());

    }


}
