package KeThua.BTQuanLiSachKhongKeThua;

public class Main {
    public static void main(String[] args) {
        NgaySinh ngaySinh = new NgaySinh(22,10,2022);
        NgaySinh ngaySinh1 = new NgaySinh(2,11,2033);
        NgaySinh ngaySinh2 = new NgaySinh(11,1,1994);

        TacGia tacgia = new TacGia("Nhat Hoang", ngaySinh);
        TacGia tacgia1 = new TacGia("Tran TY", ngaySinh);
        TacGia tacgia2 = new TacGia("Nam Ngu", ngaySinh);

        Sach sach = new Sach("Cuoc cach mang chay bo",200000,2002, tacgia);
        Sach sach1 = new Sach("Ngay Lam viec 4h",300000,1994, tacgia);
        Sach sach2 = new Sach("Ha Tang",400000,2002, tacgia);
        sach1.inTenSach();
        System.out.println(sach.kiemTraCungNam(sach2));
        System.out.println("giá sau khi giảm là: " + sach1.giaSauKhiGiam(10));
    }
}
