package textFile.TestSanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public  class Main {

    public static String path = "G:\\Module2\\BaiTap\\Exercise\\src\\textFile\\TestSanPham\\products.csv";
    public static void write(String path) throws FileNotFoundException {
        List<Product> list = new ArrayList<>();
        PrintWriter printWriter = new PrintWriter(path);
        for (Product p : list) {
            printWriter.println(p);
        }
        printWriter.close();
    }

    public static ArrayList<String> read(String path) {
            ArrayList<String> products = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
//            "G:\\Module2\\BaiTap\\Exercise\\src\\textFile\\TestSanPham\\products.csv"
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                products.add(line);
            }

        } catch (Exception a) {
            a.printStackTrace();
        }
        return products;
    }


    public static void main(String[] args) throws IOException {
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<String> records = Main.read(path);
        for (String record : records) {
            products.add(Product.parseProduct(record));
        }

        System.out.printf("%-17s %-20s %-15s %-20s %-25s %-25s\n",
                " ID",
                "TÊN SẢN PHẨM",
                "SỐ LƯỢNG",
                "GIÁ",
                "THỜI GIAN TẠO",
                "THỜI GIAN CẬP NHẬT");
        for (Product product : products) {
            System.out.printf("%-17s %-20s %-15s %-20s %-25s %-25s\n",
                    product.getId(),
                    product.getName(),
                    product.getPrice(),
                    product.getQuantity(),
                    product.getManufacturer(),
                    product.getCreateAt(),
                    product.getUpdateAt()
                    );
        }
    }
}
