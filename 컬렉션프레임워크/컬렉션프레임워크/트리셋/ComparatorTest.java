package 컬렉션프레임워크.컬렉션프레임워크.트리셋;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Mycompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        
        return (o1.compareTo(o2)) * (-1);
    }
    
}

public class ComparatorTest {
    public static void main(String [] args) {
        Set<String> set = new TreeSet<String>(new Mycompare());
        set.add("aaa");
        set.add("aa");
        set.add("a");
        set.add("b");
        System.out.println(set);
    }
}
