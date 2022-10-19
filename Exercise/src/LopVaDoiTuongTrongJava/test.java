package LopVaDoiTuongTrongJava;

public class test {
    String name;
    double pricePerKg;
    double volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public test(String name, double pricePerKg, double volume) {
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.volume = volume;
    }
}
