package Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Stackquue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        queue.add(10);
        queue.add(20);
        while(!queue.isEmpty()){
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }
        System.out.println(queue);
    }

}
