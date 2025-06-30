package Collections;
import java.util.PriorityQueue;
public class Priority3 {
    public static void main(String[] args) {
        PriorityQueue<String> p=new PriorityQueue<>();
        p.add("j");
        p.add("k");
        while(!p.isEmpty()){
            System.out.println(p.poll());
        }
    }
}
