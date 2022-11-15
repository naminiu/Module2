package textFile.copyFileText2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestFileReaderGeneric<E> {

    public  List<E> readFile(String path) {
        List<E> arrayList = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line =  "";
            while ((line = bufferedReader.readLine()) != null) {
                arrayList.add((E) (line + "\n"));

            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

//    public int findTotal(List<Integer> arrayList) {
//        int total = 0;
//        for (Integer line : arrayList) {
//            total += line;
//        }
//        return total;
//    }
//
//    public int findMax(List<Integer> arrayList) {
//        int max = arrayList.get(0);
//        for (int i = 1; i < arrayList.size(); i++) {
//            if (max < arrayList.get(i)) {
//                max = arrayList.get(i);
//            }
//        }
//        return max;
//    }
//
//    public void printMax(String path, int max) {
//        try {
//            FileWriter fileWriter = new FileWriter(path);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write("giá trị lớn nhất là " + max);
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void copy(String path, String path1) {
//        try {
//            List<Integer> arrayList = new ArrayList<>();
//            List<Integer> arrayList1 = new ArrayList<>();
//            File file = new File(path);
//            if (!file.exists()) {
//                throw new FileNotFoundException();
//            }
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = "";
//            while ((line = bufferedReader.readLine()) != null) {
//                arrayList.add(Integer.parseInt(line));
//            }
//
//            FileWriter fileWriter = new FileWriter(path);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
