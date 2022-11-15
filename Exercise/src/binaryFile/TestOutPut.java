package binaryFile;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestOutPut {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("G:\\Module2\\BaiTap\\Exercise\\src\\binaryFile\\vidu.txt");
        DataOutputStream dos = new DataOutputStream(os);
        final int NUMBER = 50;
        dos.writeInt(NUMBER);
        for (int i = 0; i <= NUMBER; i++) {
            dos.writeInt(i);
        }
        dos.writeUTF("hoang");
        dos.writeChar(1);
        dos.writeDouble(100.2);
        byte[] items = new byte[10];
        dos.write(items);
        dos.flush();
        dos.close();
    }
}
