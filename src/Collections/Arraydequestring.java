package Collections;
import java.util.ArrayDeque;
public class Arraydequestring {
    public static void main(String[] args) {
        ArrayDeque<String> a=new ArrayDeque<>();
        a.add("j");
        a.offer("h");
        a.offer("l");
        a.offer("o");
        System.out.println(a);
        a.addFirst("k");
        System.out.println(a);
        a.removeFirst();
        System.out.println(a);
        a.removeLast();
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.peek());
        a.push("p");
        System.out.println(a);
        a.pop();
        System.out.println(a);
//        a.clear();
//        System.out.println(a);
        
    }
}
