package Collections;

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class questcknamereverse {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<>();
        Stack<String> s=new Stack<>();
        q.add("kavya");
        q.add("jee");
        q.add("pp");
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.offer(s.pop());
        }
        System.out.println(q);
    }
}
