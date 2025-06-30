package Collections;
import java.util.List;
import java.util.ArrayList;

public class Listcollection {
    public static void main(String[] args) {
//        List<Integer> li = new ArrayList<>();
//        li.add(10);
//        li.add(20);
//        li.add(30);
//        System.out.println(li);
//        li.add(3,40);
//        System.out.println(li);
//        System.out.println(li.size());
//        System.out.println(li.get(3));
//        li.remove(2);
//        System.out.println(li);
//        li.set(1,50);
//        System.out.println(li);
//        System.out.println(li.contains(50));
        //* fruits name
        List<String> li1=new ArrayList<>();
        li1.add("jack");
        li1.add("kiwi");
        li1.add("orange");
        li1.add("apple");
        System.out.println(li1);
        li1.add(2,"mango");
        System.out.println(li1);
        li1.remove(2);
        System.out.println(li1);
System.out.println(li1.get(1));
        System.out.println(li1.size());
    }
}