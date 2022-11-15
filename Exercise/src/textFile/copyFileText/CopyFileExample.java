package textFile.copyFileText;

import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("G:\\Module2\\BaiTap\\Exercise\\src\\textFile\\copyFileText\\f1.txt"));
            outStream = new FileOutputStream(new File("G:\\Module2\\BaiTap\\Exercise\\src\\textFile\\copyFileText\\f1co.txt"));

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}
