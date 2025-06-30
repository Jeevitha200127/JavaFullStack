package Collections;

import java.util.Set;
import  java.util.HashSet;
public class set {
    public static void main(String[] args) {
        Set<String> s=new HashSet<String>() ;
        s.add("j");
        s.add("k");
        s.add("l");
        System.out.println(s);
        s.remove("k");
        System.out.println(s);
        s.clear();
        System.out.println(s);
    }
}
