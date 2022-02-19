package 컬렉션프레임워크.컬렉션프레임워크.트리셋;
import 컬렉션프레임워크.컬렉션프레임워크.콜렉션.Member;

public class MemberTreeSetTest {
    public static void main(String [] args) {
        MemberTreeSet a = new MemberTreeSet();
        String b = new String("abc");
        System.out.println(b.compareTo("bcd"));
        a.addmember(new Member(1, "woojin"));
        a.addmember(new Member(2, "jin"));
        a.addmember(new Member(3, "soon"));
        a.addmember(new Member(4, "hyeon"));
        a.showAllMember();
        a.removemember(4);
        a.showAllMember();   
    }
}
