package KeThua.BTQuanLiSachKhongKeThua;

public class TacGia {
    private String tacGia;
    NgaySinh ngaySinh;

    public TacGia(String tacGia, NgaySinh ngaySinh) {
        this.tacGia = tacGia;
        this.ngaySinh = ngaySinh;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public NgaySinh getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return
                "tacGia='" + tacGia + '\'' +
                ", Sinh " + ngaySinh +
                '}';
    }
}
