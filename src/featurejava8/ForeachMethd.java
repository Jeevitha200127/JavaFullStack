package featurejava8;

import java.util.ArrayList;
import java.util.List;
public class ForeachMethd {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(10);
        li.add(30);
        li.add(40);
        System.out.println(li);
        li.forEach(i-> System.out.println());
    }
}
