package Collections;
import java.util.ArrayDeque;
public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> a=new ArrayDeque();
        a.add(10);
        a.offer(20);
        a.addFirst(30);
//        a.addFirst(40);
        System.out.println(a);
      a.removeFirst();
//        a
    }
}
