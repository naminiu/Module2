public class Again {
    public static void main(String[] args) {
        int year = 12;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "Nam nhuan");
                } else {
                    System.out.println(year + "khong phai nam nhuan");
                }
            } else {
                System.out.println(year + "Nam nhuan");
            }
        } else {
            System.out.println(year + "khong phai nam nhuan");
        }
    }
}