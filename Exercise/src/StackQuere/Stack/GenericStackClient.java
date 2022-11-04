package StackQuere.Stack;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class GenericStackClient {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.size());

        int[] arrays = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack);
//        for (int a : arrays) {
//            stack.push(a);
//        }
        for (int i = arrays.length - 1; i >= 0; i--) {
            stack.push(arrays[i]);
        }
        System.out.println(stack);

        String str = "Tran Nhat Hoang";
//        str.split(" ");
//        String[] str1 = str.split(" ");
//        System.out.println(Arrays.toString(str1));
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        map.put("hai ", 2);
        map.put("ba ", 3);
        map.put("bon ", 4);
        map.put("nam ", 5);
        map.put("sau ", 6);
        map.put("bay ", 7);
        System.out.println(map);
        Map<String, Integer> map1 = new TreeMap<>();
    }
}
