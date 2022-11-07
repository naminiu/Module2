package textFile.Output;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputStream {
    public static void main(String[] args) {
        int a[] = {1, 4, 5, 6, 7};
        try {
            FileOutputStream fos = new FileOutputStream("G:/Module2/BaiTap/Exercise/src/textFile/outfile/TestDataOutputStream.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            for (int i = 0; i < a.length; i++) {
                dos.write(a[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
