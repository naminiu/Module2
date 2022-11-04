package StackQuere.DemSoLanXuatHienTrongMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TreeMap {
    public static void main(String[] args) {
        //Tạo treemap, dùng để lưu trữ số lượng
        Map<String, Integer> map = new java.util.TreeMap<>();

        String example = "Hải Bình, Quảng Trị, Hue. Hue. City,";
        //duyệt và thay đổi các ký tự có trên chuỗi

       String exampleRep =  example.replace(",", "");
       String exampleRep1 =  exampleRep.replace(".", "");
        System.out.println(exampleRep1);
        String[] arr = exampleRep1.split(" ");
        //Duyệt toàn bộ chuỗi
        String key = "";
        int value;
        System.out.println(map.get(key));
        //mỗi từ lấy ra từ chuỗi, chuyển toàn bộ thành chữ hoa hoặc chữ thường
        //coi mỗi từ lấy ra là 1 key
        for (int i = 0; i < arr.length; i++) {
            key = arr[i].toLowerCase();
            if (map.containsKey(key)) {
                value = map.get(key); // get(key): lấy ra value của key đó
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
            System.out.println(map);

        }
        Set set = map.keySet();  // lấy ra key trong map
        Iterator i = set.iterator(); // duyệt qua các phần tử
        while (i.hasNext()) {           // hasNext: có phần tử tiêp theo hay không
            key = (String) i.next();    // next():  lấy phần tử tiếp theo
            System.out.println(" Từ" +
                    " ' " + key + " ' xuất hiện "
                    + map.get(key) + " lần");
        }
    }
}
