package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
//        MyLinkedListQueue queue = new MyLinkedListQueue();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.enqueue(50);
//        System.out.println("Dequeued item is " + queue.dequeue().key);
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
//        System.out.println(queue.peek());

//        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue.size());
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        }
    }
