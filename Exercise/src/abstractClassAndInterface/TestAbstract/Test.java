package abstractClassAndInterface.TestAbstract;

public class Test {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5,5);
        ToaDo td2 = new ToaDo(7,9);
        ToaDo td3 = new ToaDo(12,14);

//        Hinh h = new Hinh(td1);
        Hinh h = new Diem(td1);
        Hinh h1 = new HinhTron(td2,2);
        Hinh h2 = new HinhChuNhat(td3,10,5);
        HinhTron hinhTron = new HinhTron(td1,2);
        System.out.println(hinhTron);

//        System.out.println(h);
//        System.out.println("TD2 " + h1.tinhDienTich());
//        System.out.println("TD3 " + h2.tinhDienTich());

    }
}
