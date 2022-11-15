package binaryFile.ObjectStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args)  {
        try {
            FileInputStream fis = new FileInputStream("G:\\Module2\\BaiTap\\Exercise\\src\\binaryFile\\ObjectStream\\testObject.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Stock[] stocks = (Stock[]) ois.readObject();
            System.out.println("đọc từ file");
            for (Stock s : stocks) {
                System.out.println(s);
            }
            ois.close();
            fis.close();
        } catch (Exception a) {
            System.out.println("lỗi " + a);
        }

    }
}
