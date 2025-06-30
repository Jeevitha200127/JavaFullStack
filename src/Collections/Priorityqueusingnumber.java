package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueusingnumber {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        q.add(10);
        q.add(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);
        q.remove(20);
        System.out.println(q);
        System.out.println(q.peek());
        q.clear();

        System.out.println(q);
        System.out.println(q.size());

    }
}
