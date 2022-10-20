package LopVaDoiTuongTrongJava;

public class THStaticProperty {
    private String name;
    private String engine;
    public static int numberOfCars;

    public THStaticProperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public static void main(String[] args) {
        THStaticProperty car1 = new THStaticProperty("Mazda 3", "Skyactiv 3");
        System.out.println(THStaticProperty.numberOfCars);
        THStaticProperty car2 = new THStaticProperty("Mazda 6", "Skyactiv 6");
        System.out.println(THStaticProperty.numberOfCars);

    }
}
