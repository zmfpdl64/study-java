package 컬렉션프레임워크.컬렉션프레임워크.트리셋;
import java.util.TreeSet;
import 컬렉션프레임워크.컬렉션프레임워크.콜렉션.Member;
public class TreeSetTest {
    public static void main(String [] args) {
        TreeSet<String> a = new TreeSet<String> ();
        TreeSet<Member> b = new TreeSet<Member>();
        b.add(new Member(1, "woojin"));  //다른 공식적인 클래스는 add가 되지만 새롭게 선언한 클래스는 내가 재정의해줘야한다.
        System.out.println(b);          //기본 출력할 때는 toString 함수가 호출된다.
        a.add("홍길동");
        a.add("강감찬");
        a.add("이순신");

        for(String c : a) {
            System.out.println(c);
        }
    }
}
