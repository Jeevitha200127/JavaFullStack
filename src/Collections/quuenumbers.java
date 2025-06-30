package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class quuenumbers {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.offer(2);
        System.out.println(q);
        System.out.println(q.getClass());
    }
}
