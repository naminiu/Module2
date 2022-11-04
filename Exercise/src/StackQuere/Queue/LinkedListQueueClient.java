package StackQuere.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListQueueClient {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50); // thêm phần tử vào
        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.remove()); // lấy ra phần tử đầu và xóa
        System.out.println(queue.poll()); // lấy ra phần tử đầu và xóa
        System.out.println(queue.poll());
        System.out.println(queue.peek()); //  chỉ lấy ra phần tử đầu tiên
        System.out.println(queue.element()); //  chỉ lấy ra phần tử đầu tiên

        System.out.println(queue);


    }
    }
