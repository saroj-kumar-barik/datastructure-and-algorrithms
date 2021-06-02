package AlgoAgain.DAY11;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class HeapsInJava {
    public static void main(String[] args) {
        // Priority Queue is by default min heap.
        Queue<String> pQueue = new PriorityQueue<String>();
//        pQueue.add(11);
//        pQueue.add(1);
//        pQueue.add(41);
//        pQueue.add(112);

        pQueue.add("O");
        pQueue.add("A");
        pQueue.add("D");

        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue);
        // To make it Max heap use - Collections.reverseOrder()
        Queue<Integer> pRQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        pRQueue.add(11);
        pRQueue.add(1);
        pRQueue.add(41);
        pRQueue.add(112);

        System.out.println(pRQueue.peek());
        System.out.println(pRQueue.poll());
        System.out.println(pRQueue);

    }
}
