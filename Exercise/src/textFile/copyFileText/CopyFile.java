package textFile.copyFileText;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    // copy tất cả phần con bên trong
    public static void copyAll(File f1, File f2) {
        try {
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        if (f1.isDirectory()) {
//            File[] mangCon =f1.listFiles();
//            for (File file : mangCon) {
//                File file_new = new File(f2.getAbsoluteFile() + "\\" + file.getName());
//                copyAll(file,file_new);
//            }
//        }
    }

    public static void main(String[] args) {
        File f1 = new File("G:\\Module2\\BaiTap\\Exercise\\src\\textFile\\copyFileText\\f1.txt");
        File f2 = new File("G:\\Module2\\BaiTap\\Exercise\\src\\textFile\\copyFileText\\f1copy.txt");
        CopyFile.copyAll(f1,f2);
    }
}
