package VongLapJava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
        int[] arr =
                {4, 1, 43, 18, 9};
//                 1 4 43 18 9
//                 1 4 43 18 9
//                 1 4 18 43 9
//                 1 4 18 9 43
//
//                1 4 9 18 43

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        Queue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.offer("3");
        priorityQueue.offer("7");
        priorityQueue.offer("9");
        priorityQueue.offer("5");
        priorityQueue.offer("6");
        priorityQueue.offer("8");
        System.out.println(priorityQueue.toString());


        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());


        Deque<Integer> priorityQueue1 = new ArrayDeque<Integer>();
        priorityQueue1.offer(4);
        priorityQueue1.offer(8);
        priorityQueue1.offer(5);


        priorityQueue1.offerLast(111);

        priorityQueue1.offerFirst(5);
        System.out.println(priorityQueue1);

    }
}
