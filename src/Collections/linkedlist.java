package Collections;

import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args) {
        List<String> li=new LinkedList<>();
        li.add("jee");
        li.add("kavya");
        li.add("nayana");
        System.out.println(li);
        li.remove(2);
        System.out.println(li);
        System.out.println(li.size());
        li.addFirst("pavi");
        System.out.println(li);
        li.addLast("ravi");
        System.out.println(li);
        li.removeFirst();
        System.out.println(li);
        li.removeLast();
        System.out.println(li);
        System.out.println(li.get(1));

        li.clear();
        System.out.println(li);
    }
}
