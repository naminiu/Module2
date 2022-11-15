package StringRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testRegex {
    public static Scanner scanner = new Scanner(System.in);
    private static final String ACCOUNT_REGEX = "(84|0[3,5,7,9])[0-9]{8}\b";
    public testRegex() {
    }
    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("nhập số điện thoại");
        String check = scanner.nextLine();

        while (testRegex.validate(check)) {
            System.out.println(check);
            break;
        }

//        System.out.println("nhập số điện thoại");
//        String check = scanner.nextLine();
//        boolean check = true;
//
//        while (testRegex.validate(check)) {
//            System.out.println(check);
//        }
    }
}
