package ThuatToanSapXep;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String s = "mot ngay moi, hom nay. Tran Nhat Hoang";
        String[] a = s.split("\\'nay.'|\\,");
        System.out.println(Arrays.toString(a));
  }
}
