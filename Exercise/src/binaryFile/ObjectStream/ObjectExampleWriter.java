package binaryFile.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectExampleWriter {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("G:\\Module2\\BaiTap\\Exercise\\src\\binaryFile\\ObjectStream\\testObject.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        Stock[] stocks = new Stock(1, "Yellow", 50000.0, 20);
        Stock[] stocks = new Stock[3];
        stocks[0] = new Stock(1, "yellow", 20000, 50);
        stocks[1] = new Stock(2, "yellow", 20000, 50);
        stocks[2] = new Stock(3, "yellow", 20000, 50);
        oos.writeObject(stocks);
        oos.close();
    }
}
