package Collections;

import java.util.LinkedList;
import java.util.List;

public class Rollnolinkedlist {
    public static void main(String[] args) {
        List<String> li = new LinkedList<>();
        li.add("1");
        li.add("D");
        li.add("B");
        li.add("1");
        li.add("9");
        System.out.println(li);
     li.remove(3);
   System.out.println(li);
      li.removeFirst();
    System.out.println(li);
     li.removeLast();
       System.out.println(li);
      li.addFirst("1");
       System.out.println(li);
      li.addLast("10");
      System.out.println(li);
      System.out.println(li.get(3));
       System.out.println(li.size());
      System.out.println(li.contains(9));
  li.clear();
     System.out.println(li);

    }
}