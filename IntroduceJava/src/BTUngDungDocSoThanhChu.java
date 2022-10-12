import java.util.Scanner;

public class BTUngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Nhập so");
            num = scanner.nextInt();
        } while (num < 0 || num > 9999);
        readWord(num);
    }

    public static void readWord(int num) {
        String wordFull;
        int third;
        int second;
        int first;
        int first0;
        first0 = num / 1000;
        first = (num / 100) % 10;
        second = (num % 100) / 10;
        third = num % 10;

        if (num < 10) {
            wordFull = ZerotoNine(third);
            System.out.println(num + " đọc là " + wordFull);
        } else if (num < 20) {
            wordFull = TenToNineTeen(third);
            System.out.println(num + " đọc là " + wordFull);
        } else if (num < 100) {
            wordFull = twentyToNineTyNine(second, third);
            System.out.println(num + " đọc là " + wordFull);
        } else if (num < 1000) {
            wordFull = OneHundredTo999(first, second, third);
            System.out.println(num + " đọc là " + wordFull);
        } else if (num < 10000) {
            wordFull = OneHundredTo999(first0, first, second, third);
            System.out.println(num + " đọc là " + wordFull);
        }
    }

    public static String ZerotoNine(int num) {
        String word = "";
        switch (num) {
            case 0 -> word = "Zero ";
            case 1 -> word = "One ";
            case 2 -> word = "Two ";
            case 3 -> word = "Three ";
            case 4 -> word = "Four ";
            case 5 -> word = "Five ";
            case 6 -> word = "Six ";
            case 7 -> word = "Seven ";
            case 8 -> word = "Eight ";
            case 9 -> word = "Nine ";
        }
        return word;
    }

    public static String TenToNineTeen(int num) {
        String word = null;
        switch (num) {
            case 0 -> word = "ten";
            case 1 -> word = "eleven";
            case 2 -> word = "twelve";
            case 3 -> word = "thirteen";
            case 4 -> word = "fourteen";
            case 5 -> word = "fiveteen";
            case 6 -> word = "sixteen";
            case 7 -> word = "seventeen";
            case 8 -> word = "eighteen";
            case 9 -> word = "nighteen";
        }
        return word;
    }

    public static String twentyToNineTyNine(int second, int third) {
        String word = null;
        switch (second) {
            case 2 -> word = (third == 0 ? "Twenty" : "Twenty" + " " + ZerotoNine(third));
            case 3 -> word = (third == 0 ? "Thirty" : "Thirty" + " " + ZerotoNine(third));
            case 4 -> word = (third == 0 ? "Fourty" : "Fourty" + " " + ZerotoNine(third));
            case 5 -> word = (third == 0 ? "Fifty" : "Fifty" + " " + ZerotoNine(third));
            case 6 -> word = (third == 0 ? "Sixty" : "Sixty" + " " + ZerotoNine(third));
            case 7 -> word = (third == 0 ? "Seventy" : "Seventy" + " " + ZerotoNine(third));
            case 8 -> word = (third == 0 ? "Eighty" : "Eighty" + " " + ZerotoNine(third));
            case 9 -> word = (third == 0 ? "Ninety" : "Ninety" + " " + ZerotoNine(third));
        }
        return word;
    }

    public static String OneHundredTo999(int first, int second, int third) {
        String word = null;
        if (second == 0) {
            if (third == 0) {
                word = ZerotoNine(first) + "Hundred";
            } else {
                word = ZerotoNine(first) + "Hundred And " + ZerotoNine(first);
            }
        } else if (second == 1) {
            word = ZerotoNine(first) + "Hundred And " + TenToNineTeen(second);
        } else {
            word = ZerotoNine(first) + "Hundred And " + twentyToNineTyNine(second, third);
        }
        return word;
    }

    public static String OneHundredTo999(int first0, int first, int second, int third) {
        String word = null;
        if (first == 0) {
            if (second == 0) {
                if (third == 0) {
                    word = ZerotoNine(first0) + "Thousand ";
                } else {
                    word = ZerotoNine(first0) + "Thousand And " + ZerotoNine(third);
                }
            } else {
                word = ZerotoNine(first0) + "Thousand And " + twentyToNineTyNine(second, third);
            }
        } else {
            word = ZerotoNine(first0) + "Thousand And " + OneHundredTo999(first, second, third);
        }
        return word;
    }

}


