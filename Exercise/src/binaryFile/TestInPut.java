package binaryFile;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestInPut {
    public static void main(String[] args) throws IOException {
//        FileInputStream is = new FileInputStream("G:\\Module2\\BaiTap\\Exercise\\src\\binaryFile\\vidu.txt");
        InputStream is = new FileInputStream("G:\\Module2\\BaiTap\\Exercise\\src\\binaryFile\\vidu.txt");
        DataInputStream dis = new DataInputStream(is);
        int items = dis.readInt();
        for (int i = 0; i <= items; i++) {
            int n = dis.readInt();
            System.out.println(n + "");
        }
        System.out.println(dis.readInt());
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readUTF());
        System.out.println(dis.readDouble());
        dis.close();
    }

}
