package Test.doituong;

import java.time.Instant;
import java.util.Date;

public class Student {
    private String name;
    private int age;
    private float height;

    Instant createAT = new Date().toInstant();
    Instant updateAT = Instant.now();


    public Student() {
    }

    public Student(String name, int age, float height, Instant createAT, Instant updateAT) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.createAT = createAT;
        this.updateAT = updateAT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Instant getCreateAT() {
        return createAT;
    }

    public void setCreateAT(Instant createAT) {
        this.createAT = createAT;
    }

    public Instant getUpdateAT() {
        return updateAT;
    }

    public void setUpdateAT(Instant updateAT) {
        this.updateAT = updateAT;
    }

//    @Override
//    public String toString() {
//        return "%s,%s,%s,%s,%s",this.name,;
//    }
}
