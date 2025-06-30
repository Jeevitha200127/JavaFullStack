package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueuealphabetorder {
    public static void main(String[] args) {
        Queue<String> q=new PriorityQueue<>();
        q.add("ajay");
        q.add("ram");
        q.add("kavaya");
        System.out.println(q);

        System.out.println(q.peek());;
    }
}
