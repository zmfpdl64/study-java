package 컬렉션프레임워크.컬렉션프레임워크.해쉬셋;
import java.util.HashSet;

public class HashSetTest {
    public static void main(String [] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("임정순"));
        hashSet.add(new String("이우진"));
        hashSet.add(new String("이귀순"));
        hashSet.add(new String("이한솔"));
        hashSet.add(new String("이우진"));

        System.out.println(hashSet);
    }
}
