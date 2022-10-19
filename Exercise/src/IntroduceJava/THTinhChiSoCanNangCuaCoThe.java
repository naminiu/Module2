package IntroduceJava;

import java.util.Scanner;

public class THTinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        float weight;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng(kg)");
        weight = scanner.nextFloat();
        System.out.println("Nhập chiều cao(m: ví dụ 1.65)");
        height = scanner.nextFloat();
        float bmi = weight / (height * height);
        System.out.println("Chỉ số bmi là " + bmi + ". Tình trạng: ");
        System.out.println(
                (bmi < 18.5) ? "Gầy" :
                        ( bmi < 25.0) ? "Bình thường" :
                                ( bmi < 30.0) ? "Mập" : "Béo phì"
        );
    }
}
