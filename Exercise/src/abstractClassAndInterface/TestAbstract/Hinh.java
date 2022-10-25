package abstractClassAndInterface.TestAbstract;

public abstract class Hinh {
    protected ToaDo toaDo;
    public Hinh(){}

    public Hinh(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    @Override
    public String toString() {
        return "Hinh{"  + toaDo +
                '}';
    }

     abstract double tinhDienTich();

}
