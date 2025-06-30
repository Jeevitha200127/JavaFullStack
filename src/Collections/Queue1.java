package Collections;
import  java.util.Queue;
import java.util.LinkedList;


public class Queue1 {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("ajay");
        queue.offer("jay");
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
    }
}
