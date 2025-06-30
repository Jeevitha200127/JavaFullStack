package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedset {
    public static void main(String[] args) {
        Set<String> s=new LinkedHashSet<>();
        s.add("monkey");
        s.add("cat");
        s.add("dog");
        s.add("kuri");
        System.out.println(s);

    }
}
