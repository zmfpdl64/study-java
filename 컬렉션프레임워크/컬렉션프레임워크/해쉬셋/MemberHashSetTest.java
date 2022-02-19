package 컬렉션프레임워크.컬렉션프레임워크.해쉬셋;
import 컬렉션프레임워크.컬렉션프레임워크.콜렉션.Member;

public class MemberHashSetTest {
    public static void main(String [] args) {
        MemberHashSet a = new MemberHashSet();
        a.addMember(new Member(1, "woojin"));
        a.addMember(new Member(2, "bin"));
        a.addMember(new Member(3, "jin"));
        a.addMember(new Member(4, "hyeon"));

        a.showAllMember();
        a.removemember(2);
        a.showAllMember();
    }
}
