package abstractClassAndInterface.TestAbstract;

public class Diem extends Hinh{

    public Diem(ToaDo toaDo) {
        super(toaDo);
    }
    public Diem(){}

    @Override
    public String toString() {
        return "Diem{"  + toaDo +
                '}';
    }

    @Override
    public double tinhDienTich() {
        return 1;
    }
}
