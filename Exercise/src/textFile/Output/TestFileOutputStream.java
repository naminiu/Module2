package textFile.Output;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("G:/Module2/BaiTap/Exercise/src/textFile/outfile/TestFileOutputStreamclass.txt");
        try {
            fout.write(90);
            fout.write(66);
            fout.write(90);
            fout.write(90);
            fout.write(90);
            fout.close();

//            System.out.println("success...");
//            String s = "welcome to";
//            byte[] b = s.getBytes();
//            fout.write(b);
        } catch (Exception e) {
            System.out.println(e);
//        } finally {
            // close file output stream
//            fout.close();
//        }
        }

    }
}
