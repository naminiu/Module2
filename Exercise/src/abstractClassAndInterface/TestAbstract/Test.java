package abstractClassAndInterface.TestAbstract;

public class Test {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5,5);
        ToaDo td2 = new ToaDo(7,9);
        ToaDo td3 = new ToaDo(12,14);

        Hinh h1 = new HinhTron();
        Hinh h2 = new HinhChuNhat();
        Hinh h3 = new Diem();
        h2 = h3;
        HinhTron h6 =(HinhTron) h1;
        Hinh h5 = h1;


//        System.out.println(h);
//        System.out.println("TD2 " + h1.tinhDienTich());
//        System.out.println("TD3 " + h2.tinhDienTich());

    }
}
