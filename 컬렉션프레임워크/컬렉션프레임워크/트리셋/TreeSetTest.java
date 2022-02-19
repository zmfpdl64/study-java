package 컬렉션프레임워크.컬렉션프레임워크.트리셋;
import java.util.TreeSet;
public class TreeSetTest {
    public static void main(String [] args) {
        TreeSet<String> a = new TreeSet<String> ();
        a.add("홍길동");
        a.add("강감찬");
        a.add("이순신");

        for(String c : a) {
            System.out.println(c);
        }
    }
}
