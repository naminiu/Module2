package textFile.THTimGiaTriLonNhatVaGhiRaFile;

import java.util.Arrays;
import java.util.List;

import static textFile.THTimGiaTriLonNhatVaGhiRaFile.ReadAndWriteFile.findMax;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("G:\\Module2\\BaiTap\\Exercise\\src\\textFile\\THTimGiaTriLonNhatVaGhiRaFile\\max.txt");
        System.out.println(Arrays.toString(new List[]{numbers}));
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("G:\\Module2\\BaiTap\\Exercise\\src\\textFile\\THTimGiaTriLonNhatVaGhiRaFile\\result.txt", maxValue);
        System.out.println("Giá trị lớn nhất là " + maxValue);

        //G:\Module2\BaiTap\Exercise\src\textFile\THTimGiaTriLonNhatVaGhiRaFile\max.txt
    }
}
